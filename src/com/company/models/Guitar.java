package com.company.models;

import com.company.interfaces.Tune;

public class Guitar implements Tune {
    private String color;
    private int stringCount = 6;
    private int[] tensions = new int[stringCount];

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
        this.tensions = new int[stringCount];
    }

    public int[] getTensions() {
        return tensions;
    }

    @Override
    public void tune() {
        for (int i = 0; i < tensions.length; i++) {
            tensions[i] = 5;
        }
    }

    @Override
    public void play() {
        System.out.println("4 строки из песни");
        unsettle();
    }

    private void unsettle() {
        for (int i = 0; i < tensions.length; i++) {
            tensions[i] = (int) (Math.random() * 3);
        }
    }
}