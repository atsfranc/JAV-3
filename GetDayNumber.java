package com.company;
import java.util.Scanner;

public class GetDayNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the year day number (choose between 0 and 365?)");
        int yearDayNumber = input.nextInt();
        if (yearDayNumber >= 0 && yearDayNumber < 365) {
            int day = yearDayNumber % 7;
            switch (day) {
                case 0:
                    System.out.println("Monday");
                    break;
                case 1:
                    System.out.println("Tuesday");
                    break;
                case 2:
                    System.out.println("Wednesday");
                    break;
                case 3:
                    System.out.println("Thursday");
                    break;
                case 4:
                    System.out.println("Friday");
                    break;
                case 5:
                    System.out.println("Saturday");
                    break;
                case 6:
                    System.out.println("Sunday");
            }
        } else System.out.println("That is not a valid year day number");


    }
}

