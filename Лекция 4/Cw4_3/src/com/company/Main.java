package com.company;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Queue qc = new LinkedList<Character>();
        for (int i = 0; i < 5; i++)
            qc.offer(Math.random());
        while(qc.peek() != null)
            System.out.print(qc.remove()+" ");
    }
}