package com.example.ppj04;

public class Task01 {
    public static void main(String[] args) {
        // Whole numbers
        int a = 13;
        int b = 3;
        int sum = a + b; // Addition
        int diff = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Remainder (Modulus) of division

        System.out.println("Integer arithmetic:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        //Real numbers
        double x = 13.0;
        double y = 3.0;
        double sum2 = x + y; // Addition
        double diff2 = x - y; // Subtraction
        double product2 = x * y; // Multiplication
        double quotient2 = x / y; // Division
        double remainder2 = x % y; // Remainder (Modulus) of division

        System.out.println("Arithmetic of real numbers:");
        System.out.println("Sum: " + sum2);
        System.out.println("Difference: " + diff2);
        System.out.println("Product: " + product2);
        System.out.println("Quotient: " + quotient2);
        System.out.println("Remainder: " + remainder2); // Output NaN (not a number)

        // Symbolic values
        char c1 = 'a';
        char c2 = 'b';
        int sum3 = c1 + c2; // Addition
        int diff3 = c2 - c1; // Subtraction
        int product3 = c1 * c2; // Multiplication
        int quotient3 = c2 / c1; // Division
        int remainder3 = c2 % c1; // Remainder (Modulus) of division

        System.out.println("Character arithmetic:");
        System.out.println("Sum: " + sum3);
        System.out.println("Difference: " + diff3);
        System.out.println("Product: " + product3);
        System.out.println("Quotient: " + quotient3);
        System.out.println("Remainder: " + remainder3);
    }
}
