package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("maneesha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=entityManager.find(Student.class, 107);
		if(student!=null) {
		student.setAge(45);
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
		else {
			System.out.println("Invalid id");
		}
	}
	

}
