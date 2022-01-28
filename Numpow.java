package com.company;
import java.util.Scanner;
public class Numpow {

    public static void main(String[] args) {
        int base,exponent;
        int total=1;
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = numbers.nextInt();
        System.out.print("Enter the exponent: ");
        exponent = numbers.nextInt();
        for(int i = 1; i<=exponent; i++){
            total *= base;
        }
        System.out.println("The result is "+ total);

    }
}
