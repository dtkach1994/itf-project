package com.example.m02;

    public class Task46 {
        private static final String NOT_FOR_YOU = "NOTFORYOU";
        private static final String YES_NOT_FOR_YOU = "YESNOTFORYOU";

        public static void main(String[] args) {
            Task46 task = new Task46();
            System.out.println("encode([null]): " + task.encode(null));
            System.out.println("encode([empty name]): " + task.encode(""));
            System.out.println("encode(\"Crab\"): " + task.encode("Crab"));
            System.out.println("decode(\"NOTFORYOUCr5bYESNOTFORYOU\"): " + task.decode("NOTFORYOUCr5bYESNOTFORYOU"));
            System.out.println("decode(\"NOTFORYOUNOTFORYOUYESNOTFORYOU\"): " + task.decode("NOTFORYOUNOTFORYOUYESNOTFORYOU"));
        }

        public String encode(String name) {
            if (name == null || name.isEmpty()) {
                return "";
            }
            String encodedName = name.replaceAll("e", "1")
                    .replaceAll("u", "2")
                    .replaceAll("i", "3")
                    .replaceAll("o", "4")
                    .replaceAll("a", "5");
            return NOT_FOR_YOU + encodedName + YES_NOT_FOR_YOU;
        }

        public String decode(String name) {
            if (name == null || name.isEmpty()) {
                return "";
            }
            String decodedName = name.replaceFirst(NOT_FOR_YOU, "")
                    .replaceFirst(YES_NOT_FOR_YOU, "")
                    .replaceAll("1", "e")
                    .replaceAll("2", "u")
                    .replaceAll("3", "i")
                    .replaceAll("4", "o")
                    .replaceAll("5", "a");
            return decodedName;
        }
    }
