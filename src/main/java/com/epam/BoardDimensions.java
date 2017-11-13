package com.epam;

public class BoardDimensions {
    private final int pion;
    private final int poziom;

    public BoardDimensions(int pion, int poziom) {

        this.pion = pion;
        this.poziom = poziom;
    }

    public int getPion() {
        return pion;
    }

    public int getPoziom() {
        return poziom;
    }
}
