package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double year,degree=12;
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the year you born: ");
    year = inp.nextDouble();
    double result = year/degree;
    if(result == 0){
        System.out.println("Monkey");
    }else if(result == 1){
        System.out.println("Cockerel");
    }else if(result == 2){
        System.out.println("Dog");
    }else if(result == 3){
        System.out.println("Pig");
    }else if(result == 4){
        System.out.println("Mouse");
    }else if(result == 5){
        System.out.println("Bullock");
    }else if(result == 6){
        System.out.println("Tiger");
    }else if(result == 7){
        System.out.println("Rabbit");
    }else if(result == 8){
        System.out.println("Dragon");
    }else if(result == 9){
        System.out.println("Snake");
    }else if(result == 10){
        System.out.println("Horse");
    }else{
        System.out.println("Sheep");
    }
    }
}
