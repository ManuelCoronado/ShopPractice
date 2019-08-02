package com.es.EOI.shopzone.entities;

public class Technologic extends Article{
	
	private String battery;
	private String guarantee;
	
	public Technologic() {
		
	}	
	
	public Technologic(String name, String description, double price, double tax, String provider, int stock,
			String category, String battery, String guarantee, int id) {
		
		super(name, description, price, tax, provider, stock, category, id);
		this.battery = battery;
		this.guarantee = guarantee;
	}
	
	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}
	
	@Override
	public String toString() {
		String articleInfo = "Name: " + name + ". Description" + description 
				+ ". Price: " + price + "$. " + "Provider: " + provider + ". Stock: " 
				+ stock + "Category: " + category + ". Battery: " + battery 
				+ ". Gauarantee: " + guarantee;
		return articleInfo;
	}
}
