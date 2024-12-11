package org.jusan.week2.oop1.lesson;

import static java.lang.Math.*;


public class Main {
    public static void main(String[] args) {
//        Person tom = new Person();
//        Person ben = new Person();
        String str1 = "string";
        String str2 = "string";
//        System.out.println(str1.equals(str2));
        System.gc();
        String str3 = "string3";
        String[] st = {"1","2","3"};
        printAll(st);
//        double sq = abs(4);
//        System.out.println(sq);


    }
    public static void printAll(String[] ...args) {
        for (String[] s: args) {
            System.out.println(s);
        }
    }
}
