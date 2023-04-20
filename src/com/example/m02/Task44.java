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



        /*I've updated the code to remove whitespace characters from the
        beginning and end of the name string using the trim() method.
        I've also replaced any remaining whitespace characters
        (including newline and tab characters) with an empty string
        using the replaceAll() method and a regular expression
        pattern [\\s\\n\\t]+. Finally, I've added the "CLEAN"
        prefix and suffix to the cleaned name string.*/
