package org.jusan.week3.exceptions;

public abstract class Student{
    protected String name;
    protected String surname;
    protected int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
