package com.company;
import java.util.Scanner;
public class Ebob {

    public static void main(String[] args) {
        int n1,n2,choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter first number: ");
            n1 = input.nextInt();
            System.out.print("Enter second number: ");
            n2 = input.nextInt();
            if (n1 > n2) {
                for (int i = n2; i > 1; i--) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        System.out.println("GCD is " + i);
                        System.out.println("LCM is " + (n1 * n2) / i);
                        break;
                    }
                }
            }else{
                for (int i = n1; i > 1; i--) {
                    if (n1 % i == 0 && n2 % i == 0) {
                        System.out.println("GCD is " + i);
                        System.out.println("LCM is " + (n1 * n2) / i);
                        break;
                    }

                }
            }System.out.print("Press 2 for exit(if not any press button): ");
            choice = input.nextInt();


        }while(choice!=2);
        System.out.println("You are logging out.");
    }
}

