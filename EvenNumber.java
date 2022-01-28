package com.company;
import java.util.Scanner;
public class EvenNumber {

    public static void main(String[] args) {
	int number;
    Scanner input = new Scanner(System.in);

    int counter=0;
    do{
        System.out.print("Enter a number:");
        number = input.nextInt();
        if (number % 4 == 0){
            counter += number;
        }else if (number%2==1){
            System.out.println("You entered odd number.");
            break;
        }
    }while(number>0);
    System.out.println("Total: "+counter);



    }
}
