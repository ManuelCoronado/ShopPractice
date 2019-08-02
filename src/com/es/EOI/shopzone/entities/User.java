package com.es.EOI.shopzone.entities;

public class User {
	
	public String dni;
	public String name;
	public String password;
	public String mail;
	public String adress;
	public Order[] order;
	
	public User() {
		
	}
	
	public User(String dni, String name, String password, String mail, String adress, Order[] order) {
		this.dni = dni;
		this.name = name;
		this.password = password;
		this.mail = mail;
		this.adress = adress;
		this.order = order;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Order[] getOrder() {
		return order;
	}

	public void setOrder(Order[] order) {
		this.order = order;
	}
	
	
}
