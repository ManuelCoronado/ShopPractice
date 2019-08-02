package com.es.EOI.shopzone.entities;

public abstract class Article {
	public String name;
	public String description;
	public double price;
	public double tax;
	public String provider;
	public int stock;
	public String category;
	
	public Article() {
		
	}
	
	public Article(String name, String description, double price, double tax, 
			String provider, int stock, String category) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.tax = tax;
		this.provider = provider;
		this.stock = stock;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public double getFinalPrice(double tax, double price) {
		double finalTaxes = price * (tax / 100);
		double finalPrice = price + finalTaxes;
		return finalPrice;
	}
	
	@Override
	public String toString() {
		String articleInfo = "Name: " + name + ". Description" + description 
				+ ". Price: " + price + "$. " + "Provider: " + provider + ". Stock: " 
				+ stock + "Category: " + category;
		return articleInfo;
	}
}
