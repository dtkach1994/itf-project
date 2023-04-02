package com.example.ppj05;
/*Write a program  which reads four integer numbers and prints the difference between
the largest and the smallest of them. Don’t use arrays, strings or collections. */
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        int min = Math.min(Math.min(num1, num2), Math.min(num3, num4));

        int difference = max - min;

        System.out.println(difference);
    }
}

/* Short reminder of the logic for repetition

1.Import the Scanner class to read numbers from the console.
2.Read four integers num1, num2, num3, and num4 using the scanner object and the nextInt() method.
3.Find the maximum and minimum values among the numbers using the nested calls to Math.max() and Math.min() functions,
storing them in max and min variables, respectively.
4.Calculate and print the difference between the maximum and minimum values.
 */

/* About Math.min/max
Math.min() and Math.max() are methods in Java's Math class. Math.min() returns the smaller of the two input values,
 while Math.max() returns the larger of the two input values. These methods are commonly used for comparing and finding
 minimum and maximum values among numbers.
 */