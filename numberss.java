package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int a,b,c;
    Scanner number = new Scanner(System.in);
    System.out.print("Enter first number: ");
    a = number.nextInt();
    System.out.print("Enter second number: ");
    b = number.nextInt();
    System.out.print("Enter third number: ");
    c = number.nextInt();
    if(a>b && a>c){
        System.out.println("first number is the greatest");
    }else{
        if(b>c){
            System.out.println("second number is the greatest");
        }else{
            System.out.println("third number is the greatest");
        }
    }
    }
}
