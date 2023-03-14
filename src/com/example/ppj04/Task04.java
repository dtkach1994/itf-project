package com.example.ppj04;

public class Task04 {
    public static void main(String[] args) {
        String hexNumber = "3A5F";
        String binaryNumber = "";

        for (int i = 0; i < hexNumber.length(); i++) {
            char hexDigit = hexNumber.charAt(i);
            String binaryDigit = Integer.toBinaryString(Integer.parseInt(String.valueOf(hexDigit), 16));
            binaryNumber += String.format("%04d", Integer.parseInt(binaryDigit));
        }

        System.out.println(binaryNumber); // Output: 0011101001011111
    }
}