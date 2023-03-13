package com.example.ppj04;

public class Task01 {
    public static void main(String[] args) {
        // Цілі числа
        int a = 13;
        int b = 3;
        int sum = a + b; // Додавання
        int diff = a - b; // Віднімання
        int product = a * b; // Множення
        int quotient = a / b; // Ділення
        int remainder = a % b; // Остача від ділення

        System.out.println("Integer arithmetic:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Дійсні числа
        double x = 13.0;
        double y = 3.0;
        double sum2 = x + y; // Додавання
        double diff2 = x - y; // Віднімання
        double product2 = x * y; // Множення
        double quotient2 = x / y; // Ділення
        double remainder2 = x % y; // Остача від ділення (не підтримується)

        System.out.println("Arithmetic of real numbers:");
        System.out.println("Sum: " + sum2);
        System.out.println("Difference: " + diff2);
        System.out.println("Product: " + product2);
        System.out.println("Quotient: " + quotient2);
        System.out.println("Remainder: " + remainder2); // Output NaN (not a number)

        // Символьні значення
        char c1 = 'a';
        char c2 = 'b';
        int sum3 = c1 + c2; // Додавання
        int diff3 = c2 - c1; // Віднімання
        int product3 = c1 * c2; // Множення
        int quotient3 = c2 / c1; // Ділення
        int remainder3 = c2 % c1; // Остача від ділення

        System.out.println("Character arithmetic:");
        System.out.println("Sum: " + sum3);
        System.out.println("Difference: " + diff3);
        System.out.println("Product: " + product3);
        System.out.println("Quotient: " + quotient3);
        System.out.println("Remainder: " + remainder3);
    }
}
