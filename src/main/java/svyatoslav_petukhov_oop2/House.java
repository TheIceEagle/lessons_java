package svyatoslav_petukhov_oop2;

import java.util.ArrayList;

public class House {
    private String address;
    private ArrayList<Flat> flatList;

    public House(String address) {
        this.address = address;
        flatList = new ArrayList<>();
    }

    public void addFlat (Flat flat) {
        flatList.add(flat);
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Flat> getFlatList() {
        return flatList;
    }
}
