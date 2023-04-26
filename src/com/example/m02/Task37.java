package com.example.m02;

public class Task37 {
    public static void main(String[] args) {
        System.out.println("areNamesEqual(Exor, Exor): " + areNamesEqual("Exor", "Exor"));
        System.out.println("areNamesEqual(gork, Maxon): " + areNamesEqual("gork", "Maxon"));
    }

    public static boolean areNamesEqual(String name1, String name2) {
        if (name1 == null || name2 == null) {
            return false;
        }
        return name1.equals(name2);
    }
}
