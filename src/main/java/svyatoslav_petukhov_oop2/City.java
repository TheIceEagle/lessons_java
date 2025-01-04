package svyatoslav_petukhov_oop2;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<House> houseList;

    public City (String name) {
        this.name = name;
        houseList = new ArrayList<>();
    }

    public void addHouse (House house) {
        houseList.add(house);
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void showSettledList() {
        System.out.println("City: " + name);
        for (House house : houseList) {
            System.out.println("\u001B[1mHouse: "+house.getAddress()+"\u001B[0m");
            for (Flat flat : house.getFlatList()) {
                System.out.println("\u001B[42m - Flat "+flat.getNumber()+":\u001B[0m");
                if (flat.getSettlerList().isEmpty()){
                    System.out.println("\u001B[41m -- Don't settlers\u001B[0m");
                } else {
                    for (Settler settler : flat.getSettlerList()) {
                        System.out.println(settler.getName());
                    }
                }
            }
        }
    }

    }
