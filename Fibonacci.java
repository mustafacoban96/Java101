package com.company;
import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
	    int number,first=0, second = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a step number: ");
        number = inp.nextInt();
        for (int i = 1; i<=number;i++){
            System.out.println(first+", ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
