package com.example.ppj05;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number a: ");
        int a = scanner.nextInt();
        System.out.print("Input number b: ");
        int b = scanner.nextInt();
        System.out.print("Input number c: ");
        int c = scanner.nextInt();
        scanner.close();
        int middleValue = findMiddleValue(a, b, c);
        System.out.println("Average value: " + middleValue);
    }

    public static int findMiddleValue(int a, int b, int c) {
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            return a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            return b;
        } else {
            return c;
        }
    }
}