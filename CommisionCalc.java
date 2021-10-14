package com.company;
import java.util.Scanner;

public class CommisionCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your sales figure?");
        int sales = input.nextInt();

        if (sales >= 10000) {
            double commission = sales * 0.3;
            System.out.println(commission);
        }
        if (sales <= 9999 && sales >= 5001) {
            double commission = sales * 0.2;
            System.out.println(commission);
        }
        if (sales <= 4999 && sales >= 1001) {
            double commission = sales * 0.1;
            System.out.println(commission);
        }
        if (sales <= 1000) {
            System.out.println("NA");
        }
    }
}
