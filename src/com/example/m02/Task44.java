package com.example.m02;

public class Task44 {
    public static void main(String[] args) {
        System.out.println(makeNameClean("bigar"));
        System.out.println(makeNameClean("   ytuki"));
    }

    public static String makeNameClean(String name) {
        if (name == null) {
            return null;
        }
        String cleanedName = name.trim(); // remove leading and trailing whitespace
        cleanedName = cleanedName.replaceAll("\\s+", ""); // add "CLEAN" to the beginning and end of the name
        return "CLEAN" + cleanedName.toUpperCase() + "CLEAN";
    }
}