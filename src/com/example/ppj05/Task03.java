package com.example.ppj05;

    /*
        Write a program which reads three integers (say, a, b and c), then prints these three
        numbers
        System.out.println(a + " " + b + " " + c);
        and then rearranges the values in these variables in such a way that a contains the
        smallest of the three numbers, b — the middle one, and c — the largest.
        Print again System.out.println(a + " " + b + " " + c);
        and you shoud see the same three numbers, but in ascending order.
        Any two (or all three) numbers may be equal. Do not use arrays or Strings!
    */
import java.util.Scanner;

    public class Task03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            System.out.println(a + " " + b + " " + c);

            int min, mid, max;

            min = Math.min(Math.min(a, b), c);
            max = Math.max(Math.max(a, b), c);

            mid = a ^ b ^ c ^ min ^ max;

            a = min;
            b = mid;
            c = max;

            System.out.println(a + " " + b + " " + c);
        }
    }

    /* Short reminder of the program logic for repetition
        1. Instantiate a Scanner object to read numbers from the console.
        2. Read three integers a, b, and c using the scanner object and the nextInt() method.
        3. Print the read numbers on the screen.
        4. Use the Math.min() and Math.max() functions to find the minimum and maximum numbers among a, b, and c.
        Store the results in the min and max variables, respectively.
     */

    /* About Math.min/max
        Math.min() and Math.max() are methods in Java's Math class. Math.min() returns the smaller of the two input values,
        while Math.max() returns the larger of the two input values. These methods are commonly used for comparing and finding
        minimum and maximum values among numbers.
    */