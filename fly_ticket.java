package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int direct,age,distance;
    double sale12=0.5,sale24=0.1,sale65=0.3,dsale2=0.2,wayc=0.1;
    double total,total2;
    Scanner input = new Scanner(System.in);
        System.out.print("Enter your direct(1-2): ");
        direct = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter your distance: ");
        distance = input.nextInt();
        double price = distance*wayc;
        if(direct == 1 || direct == 2){
            if(direct == 2){
                if (age<12){
                    total = price-(price*sale12);
                    total2 = (total-(total*dsale2))*direct;
                    System.out.println("The total: "+ total2);
                }else if(age<24){
                    total = price-(price*sale24);
                    total2 = (total-(total*dsale2))*direct;
                    System.out.println("The total: "+ total2);
                }else if(age>=65){
                    total = price-(price*sale65);
                    total2=(total-(total*dsale2))*direct;
                    System.out.println("The total: "+ total2);
                }else{
                    total = price-(price*dsale2);
                    total2=total*direct;
                    System.out.println("The total: "+ total2);
                }
            }else{
                if (age<12){
                    total = price-(price*sale12);
                    System.out.println("The total: "+ total);
                }else if(age<24){
                    total = price-(price*sale24);
                    System.out.println("The total: "+ total);
                }else if(age>=65){
                    total = price-(price*sale65);
                    System.out.println("The total: "+ total);
                }else{
                    total = price;
                    System.out.println("The total: "+ total);
                }
            }
        }else{
            System.out.println("Invalid login");
        }
    }
}
