package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("maneesha");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student=new Student();
		student.setSid(105);
		student.setName("Latha");
		student.setAge(40);
		student.setGender("Female");
		student.setPhno(9555558634l);
		student.setMarks(97.5);
		student.setLoc("JLN");
		
		Student student1=new Student();
		student1.setSid(106);
		student1.setName("Komala");
		student1.setAge(51);
		student1.setGender("Female");
		student1.setPhno(9577778412l);
		student1.setMarks(79.0);
		student1.setLoc("Trivandram");
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityTransaction.commit();
		
	}

}
