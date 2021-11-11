package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<Double>> planetsMap = new HashMap<String, ArrayList<Double>>();
        ArrayList<Double> mercury = new ArrayList<Double>();
        mercury.add(1.1);
        mercury.add(1.2);
        mercury.add(1.3);
        planetsMap.put("Меркурий", mercury);
        ArrayList<Double> venus = new ArrayList<Double>();
        venus.add(2.1);
        venus.add(2.2);
        venus.add(2.3);
        planetsMap.put("Венера", venus);
        ArrayList<Double> earth = new ArrayList<Double>();
        earth.add(3.1);
        earth.add(3.2);
        earth.add(3.3);
        planetsMap.put("Земля", earth);
        ArrayList<Double> mars = new ArrayList<Double>();
        mars.add(4.1);
        mars.add(4.2);
        mars.add(4.3);
        planetsMap.put("Марс", mars);
        ArrayList<Double> jupiter = new ArrayList<Double>();
        jupiter.add(5.1);
        jupiter.add(5.2);
        jupiter.add(5.3);
        planetsMap.put("Юпитер", jupiter);
        ArrayList<Double> saturn = new ArrayList<Double>();
        saturn.add(6.1);
        saturn.add(6.2);
        saturn.add(6.3);
        planetsMap.put("Сатурн", saturn);
        ArrayList<Double> uran = new ArrayList<Double>();
        uran.add(7.1);
        uran.add(7.2);
        uran.add(7.3);
        planetsMap.put("Уран", uran);
        ArrayList<Double> neptun = new ArrayList<Double>();
        neptun.add(8.1);
        neptun.add(8.2);
        neptun.add(8.3);
        planetsMap.put("Нептун", neptun);

        boolean control = true;

        while (control) {

            System.out.print("Введите название планеты:\n");
            String name = reader.readLine();
            if (planetsMap.containsKey(name)) {
                System.out.println(planetsMap.get(name).toString());
            } else System.out.println("Такой планеты нет в мапе");
            control = vvod();
        }
    }

    static boolean vvod() throws IOException {
        System.out.println("Продолжить? (y/n)");
        String k = reader.readLine();
        if (k.equals("y")) return true;
        if (k.equals("n")) return false;
        else {
            System.out.println("Ошибка");
            return vvod();
        }
    }
}
