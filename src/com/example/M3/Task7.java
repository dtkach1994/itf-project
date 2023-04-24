package com.example.M3;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        String[] names = new String[] {"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[] {"lopr", "boki"};
        fixNames(names, toReplace);
        System.out.println(Arrays.toString(names));
    }

    public static void fixNames(String[] names, String[] toReplace) {
        for (int i = 1; i < names.length; i += 2) {
            names[i] = toReplace[(i-1)/2];
        }
    }
}