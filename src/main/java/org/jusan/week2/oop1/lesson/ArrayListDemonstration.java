package org.jusan.week2.oop1.lesson;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemonstration {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
////        list.add("2");
//        System.out.println(list.size());
        var family = new ArrayList<>(List.of("Peter","Paul"));
        for(String el : family) {
            System.out.println(el);
        }
        family.remove(1);
        family.add(1,"Griffin");
//        System.out.println(family);
        family.set(1,"Lois");
        family.add("Stewie");
        family.add("Brian");
        family.add("Chris");
        family.add("Megatron");
        System.out.println(family);
    }
}

