package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product,String> {//Function interface receives two arguments: one entry and one return type


	@Override
	public String apply(Product p) {
		
		return p.getName().toUpperCase();
	} 
}
