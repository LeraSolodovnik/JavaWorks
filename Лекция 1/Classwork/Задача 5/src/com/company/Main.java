package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++){
            array1[i] = new Random().nextInt()%1000;
            System.out.print("№"+(i+1)+"   "+array1[i]+"   ");
            array2[i] = new Random().nextInt()%1000;
            System.out.print(array1[2]+" \n");
        }
        //первое число в строке - элемент первого массива, второе - второго (весь массив выводится в столбец)
        for (int i = 0; i < array1.length; i++) {
            for (int j = i; j < array1.length; j++){
                if (array1[j]!=array2[i])
                    System.out.print("№"+(i+1)+" и "+(j+1)+" не совпадают.\n");
            }
        }
    }
}
