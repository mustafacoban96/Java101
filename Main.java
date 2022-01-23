package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double height, weight;
        Scanner value = new Scanner(System.in);
        System.out.print("Enter your height(m): ");
        height = value.nextDouble();
        System.out.print("Enter your weight: ");
        weight = value.nextDouble();
        double vki = (weight/(Math.pow(height,2)));
        System.out.println("Your bmi: "+vki);
    }
}
