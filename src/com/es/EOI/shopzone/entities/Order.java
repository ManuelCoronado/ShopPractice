package com.es.EOI.shopzone.entities;

import java.sql.Date;

public class Order {
	
	public String code;
	public Date date;
	public Article[] articles;
	public boolean payed = false;
	public User user;
	
	public Order() {
		
	}
	
	public Order(String code, Date date, Article[] articles, boolean payed, User user) {
		this.code = code;
		this.date = date;
		this.articles = articles;
		this.payed = payed;
		this.user = user;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Article[] getArticles() {
		return articles;
	}

	public void setArticles(Article[] articles) {
		this.articles = articles;
	}

	public boolean isPayed() {
		return payed;
	}

	public void setPayed(boolean payed) {
		this.payed = payed;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
