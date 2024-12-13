package org.jusan.week2.oop2.lesson;

public class Refrigirator  implements Switching{

    Switching switching;

    Computer computer;

//    public Refrigirator(Computer computer) {
//        this.computer = computer;
//    }

        public Refrigirator(Switching switching) {
        this.switching = switching;
    }

    @Override
    public void switchON() {
        return;
    }

    @Override
    public void switchOFF() {
        return;
    }
}
