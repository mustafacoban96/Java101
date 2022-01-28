package com.company;
import java.util.Scanner;
public class Power {

    public static void main(String[] args) {
	double number;
    int i;
    Scanner num = new Scanner(System.in);
    System.out.print("Enter a number: ");
    number = num.nextInt();
    for(i = 1; i<=number;++i){
        System.out.println(i+"\'s "+"power of 4: "+(Math.pow(i,4)));
        System.out.println(i+"\'s "+"power of 5: "+(Math.pow(i,5)));
    }
    }
}
