package com.example.m02;

public class Task41 {
    public static void main(String[] args) {
        System.out.println("isMoneyName(7Max9): " + isMoneyName("7Max9"));
        System.out.println("isMoneyName(77Hero): " + isMoneyName("77Hero"));
    }

    public static boolean isMoneyName(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }
        int len = name.length();
        boolean startsWithDigit = name.charAt(0) >= '0' && name.charAt(0) <= '9';
        boolean endsWithDigit = name.charAt(len - 1) >= '0' && name.charAt(len - 1) <= '9';
        return startsWithDigit && endsWithDigit;
    }
}
