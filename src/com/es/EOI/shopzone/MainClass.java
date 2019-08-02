package com.es.EOI.shopzone;
import java.util.Locale.Category;
import java.util.Scanner;

import com.es.EOI.shopzone.entities.Article;
import com.es.EOI.shopzone.entities.Warehouse;
import com.es.EOI.shopzone.managers.ArticleManager;
import com.es.EOI.shopzone.utils.ArticleFactory;
import com.es.EOI.shopzone.views.*;

public class MainClass {
	
	public static Warehouse warehouse = new Warehouse(100);
	public static ArticleManager manager = new ArticleManager(warehouse);
	public static MenuView menuView = new MenuView();
	public static ArticleCategoryView categoryView = new ArticleCategoryView();
	
	public static void printMenu(String option) {
		menuView.printMenu(option);
	}
	
	public static void printCategoryCreation() {
		categoryView.articleCategoryView();
	}
	
	public static void main(String[] args) {
		
		String option = "";
		Scanner scan = new Scanner(System.in);
		
		while (option.equals(0)) {
			option = scan.nextLine();
			printMenu(option);
		}
	}
}
