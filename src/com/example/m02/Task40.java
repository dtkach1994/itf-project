package com.example.m02;

public class Task40 {
    public static void main(String[] args) {
        System.out.println("getNameCode(Morat): " + getNameCode("Morat"));
        System.out.println("getNameCode(x): " + getNameCode("x"));
    }

    public static String getNameCode(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        String firstAndLastChars = name.substring(0, 1) + name.substring(name.length() - 1);
        return firstAndLastChars.toUpperCase();
    }
}

