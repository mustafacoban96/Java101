package com.company;
import java.util.Scanner;
public class Diamond {

    public static void main(String[] args) {
	    int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inp.nextInt();
        for (int x = num; x>=1; x--){
            for (int z = 1;z<=(num-x);z++){
                System.out.print(" ");
            }for(int s = 1;s<=(x*2)-1; s++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
