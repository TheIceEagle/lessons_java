package org.jusan.week2.oop2.lesson;

import java.io.Serial;

public interface Switching  {
     void switchON();
     void switchOFF();

     double PI = 3.1415926;

     default void defaultSwitch() {
          System.out.println("Must be default method based on interface rule");
     }

}
