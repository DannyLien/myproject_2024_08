package com.hank.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DayOfYear {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Please enter year:");
            String yearString = reader.readLine();
            int year = Integer.parseInt(yearString);
            System.out.println(year);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
