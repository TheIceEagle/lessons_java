package org.jusan.week2.oop2.lesson.HomeWork2SarbasAidos;

import java.util.ArrayList;
import java.util.Set;

public class Flat {
    private int number;
    private House houseAddress;
    private ArrayList<Settler> setterList = new ArrayList<Settler>(2);

    public Flat(int number, House houseAddress) {
        this.number = number;
        this.houseAddress = houseAddress;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("- Квартира: " + number + "\n");
        if(setterList.isEmpty()){
            result.append("-- Никто не живет\n");
        }else{
            for (Settler settler:setterList){
                result.append("-- Житель: ").append(settler).append("\n");
            }
        }
        return result.toString();
    }

    public void addSettler(Settler settler){
        if(setterList.size() < 2){
            setterList.add(settler);
        }else {
            System.out.println("Нельзя заселить более 2-х жителей в квартиру " + number + "\n" + houseAddress);
        }

    }


}
