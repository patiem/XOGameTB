package com.epam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Board {

    private List<String> board;

    public Board(List al) {
        this.board = al;


//
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("watek");
//            }
//        });

        //Thread t = new Thread(() -> System.out.println("watek"));

        //MyFI



    }

    @Override
    public String toString() {
        return board.toString();
    }
}
