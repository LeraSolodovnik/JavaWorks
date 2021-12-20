package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        File file = new File("Тестовый файл.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
        //new FileReader(file);
        try (FileWriter writer = new FileWriter(file, true)) {
            BufferedReader br = new BufferedReader(new FileReader("Тестовый файл.txt"));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


            System.out.println("Введите строку, которую нужно дописать в файл:");
            String str1 = console.nextLine();
            sb.append(str1);
            sb.append('\n');
            String result = sb.toString();
            writer.write(result);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
