package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV",900.00));
		list.add(new Product("Phone",1100.00));
		list.add(new Product("Watch", 50.00));
		list.add(new Product("Mouse",89.90));
		
		//We want to get the products' names in upper case letters
		
		// .stream() -> converts list to stream type
		// map method applies one function to all elements of a stream
		// .collect(Collectors.toList()) converts stream type back to list type

		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); // Reference to static method
		
		names.forEach(System.out::println); //This is a reference method for println
	}

}
