package com.es.EOI.shopzone.managers;

import com.es.EOI.shopzone.entities.Article;
import com.es.EOI.shopzone.entities.Warehouse;
import com.es.EOI.shopzone.interfaces.Manageable;

public class ArticleManager implements Manageable{
	
	private Warehouse warehouse;
	
	public ArticleManager(Warehouse warehouse) {
		super();
		this.warehouse = warehouse;
	}
	
	@Override
	public void addArticle(Article newArticle) {
		//change for or if, this loop fills the array with 1 item
		for (Article article : warehouse.getArticles()) {
			if (article.equals(null)) {
				article = newArticle;
			}
		}
		
	}
	@Override
	public void deleteArticle(Article deleteArticle) {
		for (Article article : warehouse.getArticles()) {

			if (article.equals(deleteArticle)) {
				article = null;
			}
		}
		
	}
	@Override
	public void updateArticle(Article newArticle) {
		// TODO add logic
		
	}
	@Override
	public void listArticles() {
		//TODO call string methods for each article in the warehouse
		for (Article article : warehouse.getArticles()) {
			article.toString();
			}
	}
	
	
}
