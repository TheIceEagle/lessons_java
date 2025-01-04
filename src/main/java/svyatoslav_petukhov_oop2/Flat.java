package svyatoslav_petukhov_oop2;

import java.util.ArrayList;

public class Flat {
    private int number;
    private ArrayList<Settler> settlerList;

    public Flat (int number) {
        this.number = number;
        settlerList = new ArrayList<>();
    }

    public void addSettler (Settler settler) {
        if (settlerList.size()<2) {
            settlerList.add (settler);
        } else {
            System.out.println("\u001B[41mIt is impossible to move more than 2 residents into an apartment \u001B[0m" + number);
        }
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Settler> getSettlerList() {
        return settlerList;
    }
}
