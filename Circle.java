package com.company;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter diameter of circle: ");
        int diameter = input.nextInt();
        int area = 3 * (diameter/2) * (diameter/2);
        int perimeter = 3 * diameter;
        double area2 = 0.14215 * area;
        double perimeter2 = 0.14215 * perimeter;
        System.out.println("Area= " + area2);
        System.out.println("Perimeter= " + perimeter2);
    }
}
