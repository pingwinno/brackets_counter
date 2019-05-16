package com.pingwinno;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int pairsNum;
        while (true) {
            System.out.println("Enter pairs of brackets number");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                pairsNum = in.nextInt();
                break;
            }
        }
        BracketPairsCounter counter = new BracketPairsCounter(pairsNum);

        System.out.println(counter.count());
    }
}