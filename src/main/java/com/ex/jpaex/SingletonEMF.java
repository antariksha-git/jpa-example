package com.ex.jpaex;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingletonEMF {
	
	private static EntityManagerFactory factory;
	
	private SingletonEMF() {
		
	}
	
	public static synchronized EntityManagerFactory getFactoryInstance() {
		if(factory == null) {
			factory = Persistence.createEntityManagerFactory("abc");
		}
		
		return factory;
	}

}
