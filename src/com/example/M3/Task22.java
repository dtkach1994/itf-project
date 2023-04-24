package com.example.M3;

public class Task22 {
    public static void main(String[] args) {
        int ticket1 = 10;
        int ticket2 = 77;
        int ticket3 = 777;
        int ticket4 = 54;

        System.out.println(getMyPrizes(ticket1)); // crystall
        System.out.println(getMyPrizes(ticket2)); // chip
        System.out.println(getMyPrizes(ticket3)); // chip coin
        System.out.println(getMyPrizes(ticket4)); //
    }

    public static String getMyPrizes(int ticket) {
        String prizes = "";

        if (ticket % 10 == 0) {
            prizes += "crystall ";
        }

        if (ticket % 10 == 7) {
            prizes += "chip ";
        }

        if (ticket > 200) {
            prizes += "coin ";
        }

        return prizes.trim();
    }
}
