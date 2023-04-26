package com.example.m02;

public class Task45 {
    public static void main(String[] args) {
        System.out.println("[null]: " + makeHalfOfName(null));
        System.out.println("[empty name]: " + makeHalfOfName(""));
        System.out.println("Magicoraxi: " + makeHalfOfName("Magicoraxi"));
        System.out.println("Javametro: " + makeHalfOfName("Javametro"));
    }

    public static String makeHalfOfName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        int lastIndex = name.length() / 2 + (name.length() % 2 == 0 ? 0 : 1);
        return name.substring(0, lastIndex);
    }
}

