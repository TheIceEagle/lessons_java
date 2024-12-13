package org.jusan.week2.oop2.lesson;

public class Dell extends Computer{

    //global

    public Dell(String name) {
        super(name);
    }



    @Override
    public void switchON() {
        System.out.println("Computer switched on DELL");
    }

    @Override
    public void switchOFF() {
        System.out.println("Computer switched off DELL");
    }


}
