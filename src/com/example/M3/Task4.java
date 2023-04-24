package com.example.M3;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        createForms();
    }

    public static void createForms() {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine().toUpperCase();
        String lastName = scanner.nextLine().toUpperCase();
        int ageInYears = scanner.nextInt();
        int ageInMonths = ageInYears * 10;

        System.out.println(firstName + " " + lastName + " " + ageInMonths);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(ageInMonths);

        scanner.close();
    }
}
