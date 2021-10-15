package com.company;
import java.util.Scanner;

public class GetBizhrs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day is it?");
        String day = input.nextLine();
        if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("Not business day");
        }
        if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("Not business day");
        } else {
            System.out.println("What time (in 24hr clock)?");
        }
        int time = input.nextInt();
        if (time >= 900 && time <= 1800) {
            System.out.println("Yes it is business day and hours");
        } else System.out.println("Not business hour");
    }
}
