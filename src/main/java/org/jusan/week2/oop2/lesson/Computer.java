package org.jusan.week2.oop2.lesson;

public abstract class Computer implements Switching{
    String name;
    int memory;
    int RAM;



    public Computer(String name) {
        this.name = name;
    }

    public void printFromAbsatract() {
        System.out.println("Abstract");
    }

}
