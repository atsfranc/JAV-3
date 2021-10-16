package com.company;
import java.util.Scanner;

public class GetBizhrs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it?");
        String day = input.nextLine();
        if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("Not a business day");
        }
        if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("Not a business day");
        } else {
            System.out.println("What time is it(choose between 0 to 24)?");
        }
        int time = input.nextInt();
        if (time >= 9 && time <= 18) {
            System.out.println("Yes it is business day and hours");
        } else System.out.println("Not business hour");
    }
}
