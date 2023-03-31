package com.example.ppj04;

public class Task04 {
    /*
        Lets say your student number (without the s) represents a hexadecimal number. Convert by hand
        (without using a converter) and print out this number in base2.
     */
    public static void main(String[] args) {
//        int hexNumber = 0x3A5F;
//        int number1 = 19;
//        int number2 = 0x4A;
//        int number3 = 0x11;
//
       int number1 = 19;
       int number2 = 0b1+1;
       int number3 = 0b100;


        String binaryNumber = "";
//        System.out.println(hexNumber);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
//        for (int i = 0; i < hexNumber.length(); i++) {
//            char hexDigit = hexNumber.charAt(i);
//            String binaryDigit = Integer.toBinaryString(Integer.parseInt(String.valueOf(hexDigit), 16));
//            binaryNumber += String.format("%04d", Integer.parseInt(binaryDigit));
//        }
//
//        System.out.println(binaryNumber); // Output: 0011101001011111
    }
}
