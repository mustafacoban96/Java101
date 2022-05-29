package com.company;

public class Main {

    public static void main(String[] args) {
        Araba araba1 = new Araba(); // created an Object araba1 is reference

        araba1.setModel("Reanult");
        System.out.println("Arabanın modeli " + araba1.getModel());
        araba1.setKapılar(4);

    }
}
