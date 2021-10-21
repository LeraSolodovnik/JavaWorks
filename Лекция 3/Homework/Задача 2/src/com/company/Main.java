package com.company;

import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static Scanner console = new Scanner(System.in);
    int sum = 0;

    public static void main(String[] args) {
        int sum=0;
        String max="";
        String s;

        System.out.println("Введите строку:");
        String str = console.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            sum += st.nextToken().length();
        }
        StringTokenizer st1 = new StringTokenizer(str, " ,!;:");
        int count=st1.countTokens();
        while (st1.hasMoreTokens()) {
            s=st1.nextToken();
            if (s.length()>max.length()) {
                max=s;
            }
        }

        System.out.println("Количсетво слов в строке: " + count);
        System.out.println("Количсетво символов в строке: "+ sum);
        System.out.println("Самое длинное слово в строке: "+ max);
    }

}
