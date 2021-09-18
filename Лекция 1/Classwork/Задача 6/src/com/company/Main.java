package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        char[] array = new char[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (char)(new Random().nextInt(26) + 'a');
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        char[] arr = Arrays.copyOfRange(array, 5, 10);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}
