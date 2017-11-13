package com.epam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Witaj w grze kółko i krzyżyk 1.0 ");
        System.out.println("podaj poziomy wymiar planszy: ");

        int poziom  = sc.nextInt();

        System.out.println("podaj pionowy wymiar planszy: ");

        int pion  = sc.nextInt();

        BoardDimensions bd = new BoardDimensions(pion, poziom);

        Board b = new BoardBilder(bd).viaArrayList()
                .fillUpArraysListWithNumber().build();

        System.out.println(b);

    }
}
