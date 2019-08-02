package com.es.EOI.shopzone;
import java.util.Scanner;

import com.es.EOI.shopzone.managers.ArticleManager;
import com.es.EOI.shopzone.views.*;

public class MainClass {
	
	public ArticleManager manager;
	
	public static void printMenu() {
		MenuView menu = new MenuView();
		menu.printMenu();
	}
	
	public static void printBye() {
		System.out.println("See you soon!");
	}
	
	public static void main(String[] args) {
		
		String option = "";
		Scanner scan = new Scanner(System.in);
		
		while (!option.equals("0")) {
			printMenu();
			option = scan.nextLine();
		}
		
		printBye();
		scan.close();
	}
}
