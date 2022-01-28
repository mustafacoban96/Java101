package com.company;
import java.util.Scanner;
public class TotalDigit {

    public static void main(String[] args) {
        int num,remain;
	    Scanner number = new Scanner(System.in);
        System.out.print ("Enter a number: ");
        num = number.nextInt();
        double total=0;
        do{
            remain = num%10;
            num /= 10;
            total += remain;
        }while(num>0);
        System.out.println("The result is "+total);
    }
}
