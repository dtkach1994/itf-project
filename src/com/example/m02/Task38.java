package com.example.m02;

public class Task38 {
    public static void main(String[] args) {
        String firstName = "Exor";
        String lastName = "Max";
        String fullName = makeFullName(firstName, lastName);
        System.out.println("Full name: " + fullName);
    }

    public static String makeFullName(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            return null;
        }

        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }
}
