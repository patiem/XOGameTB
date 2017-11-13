package com.epam;

@FunctionalInterface
public interface MyFI {
    public void  cokolwiek();
    public static void cokolwiek1() {
        System.out.println("cokolwiek 1");
    }

    public default void cokolwiek2() {

    }
}
