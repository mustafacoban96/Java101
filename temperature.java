package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double degree;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature: ");
    degree = input.nextDouble();
    if(degree<5){
        System.out.println("You can ski");
    }else if(5<=degree && degree<15){
        System.out.println("You can go to cinema");
    }else if(15<=degree & degree<25){
        System.out.println("You can go to picnic");
    }else if(degree>=25){
        System.out.println("You can go swimming");
    }
    }
}
