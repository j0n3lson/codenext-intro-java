package com.company;

import java.util.ArrayList;

class Main {
	/**
	 * An Item is a data class that holds info about an item in our Shopping cart
	 */
	public static class Item {
		// Add attributes to the Item class. The first one is done for you.
		String name;
		double cost;
		int count;
		String imageId;

		public Item(String name, double cost, int count, String imageId) {
			// Challenge: Are all values valid?
			this.name = name;
			this.cost = cost;
			this.count = count;
			this.imageId = imageId;
		}

		public String getName() {
			// Return the name
			return name;
		}

		public double getCost() {
			return cost;
		}

		public int getCount() {
			return count;
		}

		public String getImageId() {
			return imageId;
		}

		public String toString() {
			return String.format("Name: %s, Cost:%s, Count:%s, Imageid: %s", getName(), getCost(), getCount(), getImageId());
		}
	}

	/**
	 * A ShoppingCart contains items. It let's us add/remove items among other
	 * operations.
	 */
	public static class ShoppingCart {
		ArrayList<Item> items;

		public ShoppingCart() {
			// TODO: Create a new ArrayList
			items = new ArrayList();
		}

		/**
		 * Add an item into the ShoppingCart.
		 */
		public void addItem(Item item) {
			// Add the item to the collection
			items.add(item);

			/*
			// Challenge: Make sure we don't already have an item that matches the
			// item we want to add. We just remove the one we find and add our new on.
			removeItem(item.name);
			items.add(item);
			*/
		}

		/**
		 * Removes the first item found with the given name
		 */
		public void removeItem(String name) {
			// TODO: Loop through the items list and remove the item with the given name.
			// Hint: You need to find the index of the item with the given name
			// and then remove it with ArrayList.remove(i)
			for (int i = 0; i < items.size(); i++) {
				Item existingItem = items.get(i);
				if (existingItem.name.equals(name)) {
					items.remove(i);
				}
			}
		}


		/**
		 * Get the total of all items in the ShoppingCart
		 */
		public double getTotalPrice() {
			// TODO: Loop though all the items, get their price, and return the sum
			// all all prices
			// Hint: Don't forget about to include the item.count
			double total = 0;
			for (Item item : items) {
				total += item.getCount() * item.getCost();
			}
			return total;
		}

		public void showCart(){
			System.out.println("Items in my cart:\n" + this);
			System.out.println("My cart total: " + getTotalPrice());

		}
		 public String toString() {
			String cartString = new String();
			for (Item item : items) {
				cartString += String.format("\t%s\n", item.toString());
			}
			return cartString;
		}
	}

	public static void main(String[] args) {
		Item radio = new Item("radio", 10.0, 1, "www.google.com/radio");
		Item sneakers = new Item("jordans", 20.0, 1, "www.google.com/jordans");
		ShoppingCart cart = new ShoppingCart();

		System.out.println("# Initial cart, added a few items\n");
		cart.addItem(radio);
		cart.addItem(sneakers);
		cart.showCart();
		System.out.println();

		System.out.println("# Removed the radio\n");
		cart.removeItem("radio");
		cart.showCart();

		System.out.println("# Removed the radio\n");
		cart.removeItem("radio");
		cart.showCart();

	}
}
