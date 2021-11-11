package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        Map<String, Planets> planetsMap = new HashMap<String, Planets>();
        planetsMap.put("Меркурий", new Planets(1.1,1.2,1.3));
        planetsMap.put("Венера", new Planets(2.1,2.2,2.3));
        planetsMap.put("Земля", new Planets(3.1,3.2,3.3));
        planetsMap.put("Марс", new Planets(4.1,4.2,4.3));
        planetsMap.put("Юпитер", new Planets(5.1,5.2,5.3));
        planetsMap.put("Сатурн", new Planets(6.1,6.2,6.3));
        planetsMap.put("Уран", new Planets(7.1,7.2,7.3));
        planetsMap.put("Нептун", new Planets(8.1,8.2,8.3));

        boolean control = true;

        while (control) {

            System.out.print("Введите название планеты:\n");
            //String name = console.nextLine();
            String name = reader.readLine();
            if (planetsMap.containsKey(name)) {
                Planets planet = planetsMap.get(name);
                System.out.println(planet.getDistanceToSun()+" "+ planet.getMass()+" "+planet.getDiameter());
            } else System.out.println("Такой планеты нет в мапе");
            control = vvod();
        }

    }
    static boolean vvod() {
        System.out.println("Продолжить? (y/n)");
        String k = console.next();
        if (k.equals("y")) return true;
        if (k.equals("n")) return false;
        else {
            System.out.println("Ошибка");
            return vvod();
        }
    }
}
