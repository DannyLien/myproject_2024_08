package com.hank.day;

public class HomeWorkLeapYear {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1900; i < 2050; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }

}
