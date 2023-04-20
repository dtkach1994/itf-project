package com.example.m02;

import org.jetbrains.annotations.NotNull;

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
        int lastIndex = (int) Math.ceil(name.length() / 2.0);
        return name.substring(0, lastIndex);
    }
}

