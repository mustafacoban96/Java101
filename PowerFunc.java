package com.company;

import java.util.Scanner;

public class PowerFunc {
    static void expo(){
        Scanner input = new Scanner(System.in);
        int base, power,a = 1;
        System.out.print("Enter the base: ");
        base = input.nextInt();
        System.out.print("Enter the power: ");
        power = input.nextInt();
        for(int i = 1; i <= power; i++){
            a *= base;
        }
        System.out.println("Result: "+ a);

    }

    public static void main(String[] args) {
	expo();
    }
}
