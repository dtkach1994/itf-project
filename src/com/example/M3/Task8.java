package com.example.M3;

public class Task8 {
    public static void main(String[] args) {
        String[] names = new String[] {"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        String result = firstAndLastTogether(names);
        System.out.println(result);
    }

    public static String firstAndLastTogether(String[] names) {
        String first = names[0];
        String last = names[names.length - 1];
        return first + " AND " + last + " TOGETHER";
    }
}
