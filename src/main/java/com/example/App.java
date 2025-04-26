package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
  public static void main(String[] args) {

    // Open session
    Session session = HibernateUtil.getSessionFactory().openSession();

    // Begin transaction
    Transaction tx = session.beginTransaction();

    // Create and save student
    Student student = new Student();
    student.setName("Alice");
    student.setEmail("alice@example.com");

    session.save(student);

    // Commit transaction and close session
    tx.commit();
    session.close();

    System.out.println("Student saved successfully!");
  }
}
