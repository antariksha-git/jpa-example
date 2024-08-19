package com.ex.jpaex;

import java.util.Scanner;

public class App {

	public static void options() {

		Scanner input = new Scanner(System.in);
		BookService bookService = new BookService();
		while (true) {

			System.out.println("================================================");

			System.out.println("Enter \n" + "book-s to save book\n" 
					+ "book-u to update book\n"
					+ "book-f to find book by id\n" 
					+ "book-d to delete book\n"
					+ "tr to terminate the loop");

			System.out.println("================================================\n");

			String choice = input.nextLine();

			switch (choice) {
				case "book-s":
					bookService.saveBook();
					break;
				case "book-u":
					bookService.updateBook();
					break;
				case "book-f":
					bookService.findBookById();
					break;
				case "book-d":
					bookService.deleteBook();
					break;
				case "tr":
					System.out.println("terminating the loop!\n");
					System.out.println("Thanks for using!");
					input.close();
					return;
				default:
					System.out.println("Invalid choice, try again!");
					break;
			}
		}

	}

	public static void main(String[] args) {
		SingletonEMF.getFactoryInstance();
		options();
		System.out.println("Hey there!");
	}
}
