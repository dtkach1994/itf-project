package com.example.M3;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] ages = createAgeArray(10, 20, 30, 40);
        System.out.println(Arrays.toString(ages));
    }

    public static int[] createAgeArray(int age1, int age2, int age3, int age4) {
        int[] ages = {age1, age2, age3, age4};
        return ages;
    }
}

