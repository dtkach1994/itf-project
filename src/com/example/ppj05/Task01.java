package com.example.ppj05;
import java.util.Scanner;
public class Task01 {

    public static void main(String[] args) {
        // Input three numbers from the keyboard.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number a: ");
        int a = scanner.nextInt();
        System.out.print("Input number b: ");
        int b = scanner.nextInt();
        System.out.print("Input number c: ");
        int c = scanner.nextInt();
        scanner.close();

        // Finding the average value.
        int middleValue = findMiddleValue(a, b, c);

        // Printing the average value to the screen.
        System.out.println("Average value: " + middleValue);
    }

    public static int findMiddleValue(int a, int b, int c) {
        // If a is between b and c, a is the middle value
        if ((a >= b && a <= c) || (a >= c && a <= b)) {    //&& - means and, stop forgetting!! (comment for me)
            return a;
        }
        // If b is between a and c, b is the middle value
        else if ((b >= a && b <= c) || (b >= c && b <= a)) {  // || - reminder it s mean OR
            return b;
        }
        // Otherwise, c is the middle value
        else {
            return c;
        }
    }
}