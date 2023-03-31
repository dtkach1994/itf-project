package com.example.m02;

public class Task01 {


    public int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        int result = sum1 + sum2;
        if (result > Byte.MAX_VALUE || result < Byte.MIN_VALUE) {
            throw new IllegalArgumentException("The result of the sum exceeds the boundaries of the byte data type");
        }
        return (byte) result;
    }

    public short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }

    public static void main(String[] args) {
        Task01 converter = new Task01();

        int changedAmount = converter.changeMoneyAmount(1000.0f, 300.0f);
        System.out.println("The remaining amount of money after withdrawal: " + changedAmount);

        byte moneySum = converter.calculateMoneySum(100, 20);
        System.out.println("The amount of money: " + moneySum);

        short halfMoney = converter.halfOfMoney(500.0);
        System.out.println("Half of the money.: " + halfMoney);
    }
}

//В Java ключевое слово "return" используется для возврата значения из метода.
//Когда метод возвращает значение, он завершает свою работу и передает это значение вызывающему коду.

//Оператор throw используется для генерации исключений в программе. Когда оператор throw выполняется внутри блока кода,
// он указывает на возникновение некоторой проблемы, которая не может быть обработана в текущем контексте выполнения,
// и сообщает об этом вызывающему коду.