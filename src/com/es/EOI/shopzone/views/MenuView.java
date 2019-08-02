package com.es.EOI.shopzone.views;

import java.util.Scanner;

import com.es.EOI.shopzone.MainClass;
import com.es.EOI.shopzone.utils.ArticleFactory;

public class MenuView {
	public void printMenu(String option) {
		Scanner scan = new Scanner(System.in);
		String category;
		
		System.out.println("Welcome to ShopZone!");
		System.out.println("1. Display list of Articles");
		System.out.println("2. Add new article");
		System.out.println("3. Delete article");
		System.out.println("4.Create new user");
		System.out.println("0. Exit");
		
		switch (option) {
		case "1":
			MainClass.manager.listArticles();
			break;
			
		case "2":
			System.out.println("Enter the category of the article (Food - Technologic - Fabrics)");
			category = scan.nextLine();
			ArticleFactory.getArticle(option);
			break;
			
		case "3":
			System.out.println("Not available yet");
			//TODO MainClass.manager.deleteArticle - add id to items, delete them by id
			break;
			
		case "4":
			
			break;
			
		case "0":
			System.out.println("See you soon!");
			break;
			
		default:
			System.out.println("Invalid option");
			break;
		}
	}
}
