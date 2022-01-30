package com.company;
import java.util.Scanner;
public class MinMax {

    public static void main(String[] args) {
        int min=0,max=0,number,step;
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like enter: ");
        step = input.nextInt();
        for (int x = 1; x<=step; x++){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number>max){
                max = number;
            }if(number<min){
                min = number;
            }

        }
        System.out.println("Max number: "+max);
        System.out.println("Min number: "+min);

    }
}
