package arraylist;

import java.util.ArrayList;

public class ShoppingCartAdvanced {

	public static void main(String[] args) {
		
		ArrayList<Product> shoppingCart = new ArrayList<>();
		
		shoppingCart.add(new Product("Gas",700.0));
		shoppingCart.add(new Product("Rice",1200));
		
		// Displaying the shopping cart with detailed product information
		for(Product product:shoppingCart) {
			System.out.println(product);
		}
		

	}

}
