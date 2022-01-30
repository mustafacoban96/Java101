package com.company;
import java.util.Scanner;
public class GreatNumber {

    public static void main(String[] args) {
        int number,total=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        for (int i = 1; i<number;i++){
            if (number%i == 0){
                total +=i;
            }
        }if (total == number){
                System.out.println(number+" is great number.");
        }else{
                System.out.println(number+" is not great number.");
            }

    }
}
