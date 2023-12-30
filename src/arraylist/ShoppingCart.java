package arraylist;

import java.util.ArrayList;

/*ArrayList is a dynamic array implementation of the List interface in Java. It provides dynamic resizing, allowing you to add or remove elements easily.

Real-World Application:
Consider a scenario where you want to maintain a list of products in an online shopping cart. The number of products can vary, and you need a flexible data structure to store and manage these items.*/

public class ShoppingCart {

	//Number of products can vary so we use ArrayList
	
	public static void main(String[] args) {
		//Day 1: Array Implementation for a realworld scenario
		
		ArrayList<String> shoppingCart=new ArrayList<String>();
		//shift+ctrl+o to import any unknown library fast using eclipse
		
		//Adding items to the shopping cart
		shoppingCart.add("Laptop");
		shoppingCart.add("Headphones");
		shoppingCart.add("Smartphone");
		
		//Displaying while checkingout
		System.out.println("Shopping Cart: "+shoppingCart);
		
		//Adding more items
		shoppingCart.add("Tablet");
		shoppingCart.add("Gaming Mouse");
		
		//Displaying the updated shopping cart
		System.out.println("Updated Shopping Cart: "+shoppingCart);
		
		//Removing an item
		shoppingCart.remove("Gaming Mouse");
		
		//Displaying the final shopping cart
		System.out.println("Final Shopping Cart: "+shoppingCart);
		
		
	}
	
	/*Key Takeaways:
ArrayList is versatile for dynamically changing lists.
It provides easy methods for adding, removing, and accessing elements.
Advanced usage involves creating custom classes to store complex objects. */
	
	
}
