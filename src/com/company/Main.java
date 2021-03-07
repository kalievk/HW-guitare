package com.company;

import com.company.models.Guitar;

public class Main {

    public static void main(String[] args) {

        Guitar guitar = new Guitar();
        guitar.tune();

        for (int item : guitar.getTensions()) {
            System.out.println(item);
        }

        guitar.play();
        for (int item : guitar.getTensions()) {
            System.out.println(item);
        }
    }
}