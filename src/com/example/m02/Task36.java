package com.example.m02;

public class Task36 {
    public static void main(String[] args) {
        System.out.println("changeMoneyAmount: " + calculateAmountAfterRemoving(100f, 40.5f));
        System.out.println("calculateMoneySum: " + calculateSum((byte) 50, (byte) 40));
        System.out.println("halfOfMoney: " + calculateHalfMoney((short) 1000));
    }

    public static int calculateAmountAfterRemoving(float initialAmount, float amountToRemove) {
        float amountAfterRemoving = initialAmount - amountToRemove;
        return (int) amountAfterRemoving;
    }

    public static byte calculateSum(byte value1, byte value2) {
        return (byte) (value1 + value2);
    }

    public static short calculateHalfMoney(short initialMoney) {
        return (short) (initialMoney / 2);
    }
}
