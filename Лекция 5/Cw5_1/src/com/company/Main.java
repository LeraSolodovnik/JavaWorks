package com.company;

import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        int[] A = new int[3];
        int i = 0;


        boolean control = true;
        // boolean control2 = true;
        while (control) {
            System.out.println("Введите число:");
            String str = console.nextLine();
            try {
                A[i] = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage() + "\nПревышено количество чисел в массиве.\nВвод прекращен.");
                //control2 = false;
                break;
            }
            control = vvod();
            i++;
        }

    }

    static boolean vvod() {
        System.out.println("Ввести еще число? (y/n)");
        String k = console.nextLine();
        if (k.equals("y")) return true;
        if (k.equals("n")) return false;
        else {
            System.out.println("Ошибка");
            return vvod();
        }
    }
}


