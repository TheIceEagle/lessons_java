package org.jusan.week2.oop2.lesson.HomeWork2SarbasAidos;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<House> houseList = new ArrayList<House>();

    public City(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Город:" + name;
    }

    public void showSettledList(){
        for(House house : houseList){
            System.out.println(house);
        }
    }

    public void addHouse(House house){
        houseList.add(house);
    }
}
