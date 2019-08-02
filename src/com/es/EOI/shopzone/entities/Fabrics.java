package com.es.EOI.shopzone.entities;

public class Fabrics extends Article{
	private String material;
	private String color;
	private String size;
	
	public Fabrics () {
		
	}
	
	public Fabrics(String name, String description, double price, double tax, String provider, int stock,
			String category, String material, String color, String size) {
		super(name, description, price, tax, provider, stock, category);
		this.material = material;
		this.color = color;
		this.size = size;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		String articleInfo = "Name: " + name + ". Description" + description 
				+ ". Price: " + price + "$. " + "Provider: " + provider + ". Stock: " 
				+ stock + "Category: " + category + ". Size: " + size
				+ ". material: " + material + ". Color: " + color;
		return articleInfo;
	}
}
