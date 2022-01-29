package com.company;
import java.util.Scanner;
public class Harmonic {

    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = inp.nextInt();
        double total=0;
        for (double i=1;i<=number;i++){
            total += (1/i);
        }
        System.out.println("Result is "+total);
    }
}
