package com.ex.jpaex;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BookDao {
	
	public void saveBook(Book book) {
		EntityManager manager = SingletonEMF.getFactoryInstance().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(book);
		transaction.commit();
	}
	
	public Book findBookById(int bookId) {
		EntityManager manager = SingletonEMF.getFactoryInstance().createEntityManager();
		Book book = manager.find(Book.class, bookId);
		
		return book;
		
	}
	
	public void updateBook(Book book) {
		EntityManager manager = SingletonEMF.getFactoryInstance().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.merge(book);
		transaction.commit();
	}
	
	public void removeBook(Book book) {
		EntityManager manager = SingletonEMF.getFactoryInstance().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.remove(manager.find(Book.class, book.getBookId()));
		transaction.commit();
	}

}
