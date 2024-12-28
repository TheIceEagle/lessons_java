package org.jusan.week2.oop2.lesson.HomeWork2SarbasAidos;

import java.util.ArrayList;

public class House {
    private String address;
    private ArrayList<Flat> flatList =  new ArrayList<Flat>();
    private Flat number;

    public House(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Дом: " + address + "\n");
        for (Flat flat: flatList){
            result.append(flat).append("\n");
        }
        return result.toString();
    }



    public void addFlat(Flat flat){
        flatList.add(flat);
    }
}
