package com.ex.jpaex;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private int bookId;
	private String title;
	private String price;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
