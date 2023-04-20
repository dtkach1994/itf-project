package com.example.m02;

public class Task42 {
    public static void main(String[] args) {
        System.out.println("isInvisibleName(\"\"): " + isInvisibleName(""));
        System.out.println("isInvisibleName(\"\n\"): " + isInvisibleName("\n"));
        System.out.println("isInvisibleName(\"\nMiag \"): " + isInvisibleName("\nMiag "));
    }

    public static boolean isInvisibleName(String name) {
        if (name == null || name.length() == 0) {
            return true;
        }
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != ' ' && c != '\n' && c != '\t') {
                return false;
            }
        }
        return true;
    }
}
