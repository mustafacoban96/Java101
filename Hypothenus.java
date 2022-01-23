package com.company;
import java.util.Scanner;
public class Hypot {

    public static void main(String[] args) {
        int a,b,c;
        Scanner kenar = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = kenar.nextInt();
        System.out.print("Enter b: ");
        b = kenar.nextInt();
        System.out.print("Enter c: ");
        c = kenar.nextInt();
        int cevre = a+b+c;
        int u = (cevre)/2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+ alan);



    }
}
