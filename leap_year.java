package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int year;
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the year: ");
    year = inp.nextInt();
    if(year%4==0 && year%100!=0){
        System.out.println("The year is leap year");
    }else if(year%4!=0 || year%100==0){
        System.out.println("The year is not leap year");
    }else{
        System.out.println("Invalıd login");
    }
    }
}
