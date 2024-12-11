package org.jusan.week2.oop2.lesson;

public class ClassB extends ClassA{
    int number;

    public ClassB(int number) {
        this.number = number;
    }

    public ClassB(String name, int number) {
        super(name);
        this.number = number;
        super.printParent();
    }

    public ClassB() {
        System.out.println("Class B");
    }

    @Override
    public void printClass() {
        System.out.println("print Class B");
    }

    public void printOtherMsg() {
        System.out.println("Other message Class b");
    }
}
