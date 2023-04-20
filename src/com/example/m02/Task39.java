package com.example.m02;

public class Task39 {
    public static void main(String[] args) {
        System.out.println("isNameLucky(Exma): " + isNameLucky("Exma"));
        System.out.println("isNameLucky(Igun): " + isNameLucky("Igun"));
    }

    public static boolean isNameLucky(String name) {
        if (name == null) {
            return false;
        }
        return name.contains("a") || name.contains("A") || name.contains("o") || name.contains("O");
    }
}
