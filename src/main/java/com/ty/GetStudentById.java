package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetStudentById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("maneesha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Student student = entityManager.find(Student.class, 105);
		System.out.println("Stduent Id is " + student.getSid());
		System.out.println("Stduent Name is " + student.getName());
		System.out.println("Stduent Age is " + student.getAge());
		System.out.println("Stduent Gender is " + student.getGender());
		System.out.println("Stduent Phno is " + student.getPhno());
		System.out.println("Stduent Marks is " + student.getMarks());
		System.out.println("Stduent Loc is " + student.getLoc());

	}

}
