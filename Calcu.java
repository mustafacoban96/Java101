package com.company;
import java.util.Scanner;
public class Calcu {

    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5;
        double karmut, kelma, kdomates, kmuz, kpatlıcan;
        Scanner kg =new Scanner(System.in);
        System.out.print("Enter kg of pear: ");
        karmut = kg.nextDouble();

        System.out.print("Enter kg of apple: ");
        kelma = kg.nextDouble();

        System.out.print("Enter kg of tomato: ");
        kdomates = kg.nextDouble();

        System.out.print("Enter kg of banana: ");
        kmuz = kg.nextDouble();

        System.out.print("Enter kg of aubergine: ");
        kpatlıcan = kg.nextDouble();

        double total = ((armut*karmut)+(elma*kelma)+(domates*kdomates)+(muz*kmuz)+(patlıcan*kpatlıcan));
        System.out.println("Total of amount: "+total+" TL");

    }
}
