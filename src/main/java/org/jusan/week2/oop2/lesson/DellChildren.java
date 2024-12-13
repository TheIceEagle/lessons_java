package org.jusan.week2.oop2.lesson;

public class DellChildren extends Dell{
    public DellChildren(String name) {
        super(name);
    }

    @Override
    public void switchON() {
        System.out.println("Computer switched on DELL");
    }
}
