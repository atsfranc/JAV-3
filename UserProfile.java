package com.company;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name, age, gender, jobPref, nationality, bloodType");
        String name = myObj.nextLine();
        String gender = myObj.nextLine();
        String jobPref = myObj.nextLine();
        String nationality = myObj.nextLine();
        String bloodType = myObj.nextLine();
        int age = myObj.nextInt();
        int yearBirth = 2021 - age;
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("Gender: " + gender);
        System.out.print("Job pref: " + jobPref);
        System.out.print("Nationality: " + nationality);
        System.out.print("Blood Type: " + bloodType);
        System.out.print("Year of birth: " + yearBirth);
    }

}

