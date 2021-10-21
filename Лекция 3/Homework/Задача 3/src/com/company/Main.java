package com.company;

public class Main {

    public static void main(String[] args) {
        long time1;
        long time2;
        String str1 = "Cakes";
        String str2 = "More";

        time1 = System.currentTimeMillis();
        String str=str1;
        for (int i = 0; i < 20000; i++) {
            str+=str2;
        }

        time2 = System.currentTimeMillis();
        //System.out.println("Строка 1: " +str);
        System.out.println("Время потраченное на первый метод: " + (time2 - time1));

        time1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        for (int i = 0; i < 20000; i++) {
            sb.append(str2);
        }
        String result = sb.toString();

        time2 = System.currentTimeMillis();
        //System.out.println("Строка 2: " +result);
        System.out.println("Время потраченное на второй метод: " + (time2 - time1));
    }
}
