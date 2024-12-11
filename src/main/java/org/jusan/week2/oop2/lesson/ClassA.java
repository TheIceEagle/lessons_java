package org.jusan.week2.oop2.lesson;

public class ClassA {

    String name;
    public ClassA() {
        System.out.println("Class A");
    }

    public ClassA(String name) {
        this.name = name;
    }

    public void printClass() {
        System.out.println("Print Class A");
    }

    public void printOtherMsg() {
        System.out.println("Other message Class a");
    }

    public void printParent() {
        System.out.println("Class A is a superclass");
    }
}
