package com.company;

import java.util.Scanner;


public class Main {

    public static void lineStr(String s) {
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    static String checkStr(String s) throws NoSpaceException {
        if (!s.contains(" ")) {
            throw new NoSpaceException("В данной строке нет пробелов");
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите строку:\n");
        String s = console.nextLine();
        lineStr(s);
        try {
            checkStr(s);
        } catch (NoSpaceException e) {
            System.out.println(e.getMessage());
        }

    }

    static class NoSpaceException extends Exception {
        public NoSpaceException(String message) {
            super(message);
        }
    }
}
