package com.company;
import java.util.Scanner;
public class Stars {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        int v = number-1;
        for (int x = 1; x<=number;x++){
            for (int k = 1; k<=(number-x); k++){
                System.out.print(" ");
            }
            for (int y =1; y<=((2*x)-1); y++){
                System.out.print("*");

            }
            System.out.println(" ");

        }for (int a = v; a >=1; a--){
            for (int b = 1; b<=number-a; b++){
                System.out.print(" ");
            }for (int c = 1; c<=((2*a)-1);c++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
