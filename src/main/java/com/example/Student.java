package com.example;

import jakarta.persistence.*;

@Entity                      // Marks this class as a Hibernate Entity (maps to a table)
@Table(name = "students")    // Specifies the table name in the DB
public class Student {

  @Id                     // Marks 'id' as primary key
  @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment ID
  private int id;

  private String name;     // Will become 'name' column
  private String email;    // Will become 'email' column

  // Getters and Setters (required by Hibernate)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
