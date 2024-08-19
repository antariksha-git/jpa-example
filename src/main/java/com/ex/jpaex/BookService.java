package com.ex.jpaex;

import java.util.Scanner;

public class BookService {
	BookDao bookDao = new BookDao();
	Scanner input = new Scanner(System.in);

	public void saveBook() {
		System.out.println("Enter book id, title & price");
		int bookId = input.nextInt();
		input.nextLine(); // next line input
		String title = input.nextLine();
		String price = input.nextLine();

		Book book = new Book();
		book.setBookId(bookId);
		book.setTitle(title);
		book.setPrice(price);
		
		if(bookDao.findBookById(book.getBookId()) == null) {
			bookDao.saveBook(book);
		} else {
			System.out.println("book id already exist, enter book id and try again!");
		}

	}

	public void findBookById() {
		System.out.println("Enter book id that needs to be found: ");
		int bookId = input.nextInt();

		Book book = bookDao.findBookById(bookId);

		if (book != null) {

			System.out.println(book.getBookId() + " " + book.getTitle() + " " + book.getPrice());
			return;

		}
		
		System.out.println("No such book found!");

	}

	public void updateBook() {
		System.out.println("Enter book id that needs to be updated: ");
		int bookId = input.nextInt();
		input.nextLine();

		Book book = bookDao.findBookById(bookId);

		if (book != null) {
			System.out.println("Enter title followed by price: ");
			String title = input.nextLine();
			String price = input.nextLine();

			book.setTitle(title);
			book.setPrice(price);
		}

		bookDao.updateBook(book);

	}

	public void deleteBook() {
		System.out.println("Enter book id that needs to be deleted: ");
		int bookId = input.nextInt();
		input.nextLine();

		Book book = bookDao.findBookById(bookId);

		if (book != null) {
			bookDao.removeBook(book);
			return;
		}

		System.out.println("Wrong book id entered!");

	}
}
