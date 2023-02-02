package entities;

import java.util.Objects;

public class Product {
	
	private String name;
	private Double price;
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static void staticPriceUpdate(Product p) { //Static methods require own object argument to work with
		 p.setPrice(p.getPrice()*1.10);
	}
	
	public void nonStaticPriceUpdate() {// non static methods work wit the same object in which it's defined, therefore we don't pass a Product as argument 
		this.setPrice(this.getPrice()*1.10);
	}
	
	@Override
	public String toString() {
		return this.name + " " + String.format("%.2f",this.price);
	}

	
}
