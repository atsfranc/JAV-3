package com.company;
import java.util.Scanner;

public class MovieDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        if (age < 5) {
            double price = 7 * 0.4;
            System.out.println(price);
        }
        if (age > 60) {
            double price = 7 * 0.45;
            System.out.println(price);
        }
        if (age >= 5 && age <= 60) {
            System.out.println("How many tickets do you wish to buy?");
            int number = input.nextInt();
            if (number >= 2) {
                double price = 7 * 0.7 * number;
                System.out.println(price);
        } else System.out.println(7 * number);

        }
    }
}
