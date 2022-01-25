package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int counter=0,num,sayi=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inp.nextInt();

        for(; num>0;num--){
            if (num%3 == 0 && num%4==0){
                sayi+=num;
                counter++;
            }

        }System.out.println("Average: "+sayi/counter);


    }
}
