package com.hank.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secret = new Random().nextInt(10) + 1;
        System.out.println("secret = " + secret);
        int number = 0;

        while (number != secret) {
            System.out.print("Please enter a number : ");
            number = scanner.nextInt();
            if (number > secret) {
                System.out.println("Lower");
            } else if (number < secret) {
                System.out.println("Higher");
            } else {
                System.out.println("Great, the number is : " + secret);
            }

        }


    }


}
