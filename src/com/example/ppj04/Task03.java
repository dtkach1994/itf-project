package com.example.ppj04;

public class Task03 {
    public static void main(String[] args) {

        //"Header of the table"
        System.out.println(" x | y | x && y | x || y | !x ");
        System.out.println("---|---|--------|--------|----");

        //"Displaying table values"
        boolean x, y;
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                x = i == 1; // x It will be true if i equals 1.
                y = j == 1; // y It will be true if i equals 1.

                System.out.printf(" %d | %d |   %b  |   %b  | %b \n", i, j, x && y, x || y, !x);
            }
        }
    }
}
