package com.company;
import java.util.Scanner;
public class Kombinasyon {

    public static void main(String[] args) {
	double n,r,nc=1,rc=1,tc=1;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number for n: ");
    n = input.nextDouble();
    System.out.print("Enter a number for r: ");
    r = input.nextDouble();
    for (int counter=1;counter<=n;counter++){
        nc *= counter;
    }for (int counter=1;counter<=r;counter++){
        rc *= counter;
    }for(int counter=1;counter<=(n-r);counter++){
        tc *= counter;
        }
    double kom = nc/(rc*(tc));
    System.out.println("Result is "+ kom);
    }
}
