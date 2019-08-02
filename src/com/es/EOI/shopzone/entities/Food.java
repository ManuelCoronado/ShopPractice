package com.es.EOI.shopzone.entities;

import java.sql.Date;

public class Food extends Article{

	private Date expirationDate;
	private String allergens;
	
	public Food() {
		
	}
	
	public Food(String name, String description, double price, double tax, String provider, int stock,
			String category, Date expirationDate, String allergens, int id) {
		
		super(name, description, price, tax, provider, stock, category, id);
		this.expirationDate = expirationDate;
		this.allergens = allergens;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getAllergens() {
		return allergens;
	}

	public void setAllergens(String allergens) {
		this.allergens = allergens;
	}
	
	@Override
	public String toString() {
		String articleInfo = "Name: " + name + ". Description" + description 
				+ ". Price: " + price + "$. " + "Provider: " + provider + ". Stock: " 
				+ stock + "Category: " + category + ". Allergens: " + allergens 
				+ ". Expiration date: " + expirationDate;
		return articleInfo;
	}
}
