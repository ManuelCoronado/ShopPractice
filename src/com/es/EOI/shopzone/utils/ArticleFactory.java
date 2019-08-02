package com.es.EOI.shopzone.utils;

import com.es.EOI.shopzone.entities.*;

public class ArticleFactory {
	public static Article getArticle(String category) {
		Article article = null;
		
		String categoryCheck = category.toLowerCase();
		
		switch (categoryCheck) {
		case "fabrics":
			article = new Fabrics();
			break;
		case "food":
			article = new Food();
			break;
		case "technologic":
			article = new Technologic();
			break;
		default:
			break;
		}
		
		return article;
	}
}
