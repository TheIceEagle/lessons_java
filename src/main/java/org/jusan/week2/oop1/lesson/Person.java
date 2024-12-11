package org.jusan.week2.oop1.lesson;

public class Person {
    public String name;
    int age;

    private final static int STRENGTH = 100;

    private final int SPEED;
    static int maxLifespan = 100;

    {
        System.out.println("1 = Initialiser");
    }

    {
        System.out.println("2 =  Initialiser");
    }

    static {
        System.out.println("Static initialiser");
    }

    public Person() {
        System.out.println("Contructor initialisation");
        SPEED = 50;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", SPEED=" + SPEED +
                ", STRENGTH="+STRENGTH+
                '}';
    }
}
