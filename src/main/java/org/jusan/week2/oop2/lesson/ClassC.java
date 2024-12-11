package org.jusan.week2.oop2.lesson;

public class ClassC extends ClassB implements Speakable{

    public ClassC() {
        System.out.println("Class C");
    }

    @Override
    public void printClass() {
        System.out.println("Print Class C");
    }

    public void printOtherMsg() {
        System.out.println("Other message Class c");
    }

    @Override
    public void speak() {
        System.out.println("Speak from interface");
    }
}
