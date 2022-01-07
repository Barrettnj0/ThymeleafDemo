package com.example.thymeleafdemo.model;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
public class Person {

    //
    // Data Members
    //

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;

    //
    // Constructors
    //

    public Person() { }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //
    // Getters
    //

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //
    // Setters
    //


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
