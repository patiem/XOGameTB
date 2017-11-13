package com.epam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoardBilder {
    private final BoardDimensions bd;
    private List al;
    private int initialCapacity;

    public BoardBilder(BoardDimensions bd) {
        this.bd = bd;
    }

    public BoardBilder viaArrayList() {
        initialCapacity = bd.getPion()* bd.getPoziom();
        al = new ArrayList(initialCapacity);
        return this;
    }

    public Board build() {
        return new Board(al);
    }

    public BoardBilder fillUpArraysListWithNumber() {
        al = IntStream.range(0,initialCapacity).mapToObj(a -> new Integer(a)).collect(Collectors.toList());
        return this;
    }

}
