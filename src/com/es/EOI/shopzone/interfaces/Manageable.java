package com.es.EOI.shopzone.interfaces;
import com.es.EOI.shopzone.entities.*;

public interface Manageable {
	public void addArticle(Article article);
	public void deleteArticle(int id);
	public void updateArticle(Article article);
	public void listArticles();
	//TODO add edit article
}
