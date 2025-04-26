package com.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

  private static final SessionFactory sessionFactory = buildSessionFactory();

  private static SessionFactory buildSessionFactory() {
    try {
      // Load configuration and add annotated classes
      return new Configuration()
        .configure("hibernate.cfg.xml")        // Load Hibernate config
        .addAnnotatedClass(Student.class)     // Add Entity
        .buildSessionFactory();
    } catch (Throwable ex) {
      System.err.println("SessionFactory creation failed: " + ex);
      throw new ExceptionInInitializerError(ex);
    }
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}
