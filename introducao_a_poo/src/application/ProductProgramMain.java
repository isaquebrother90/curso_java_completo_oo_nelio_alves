package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Rectangle;
import entities.Triangle;

public class ProductProgramMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		// Product - Retirar e incluir produtos em estoque
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.println();
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		product.setPrice(450.98);
		System.out.println("Updated price: " + product.getPrice());
		
		//Product product = new Product(name, price);
		
		System.out.println("Product data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		System.out.println();
		product.removeProducts(quantity);
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}
