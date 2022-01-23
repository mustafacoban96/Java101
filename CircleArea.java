package com.company;
import java.util.Scanner;
public class CircleArea {

    public static void main(String[] args) {
        double pi = 3.14, r, alpha;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the degree of central slice: ");
        alpha = input.nextDouble();
        System.out.print("Enter the radius of circle: ");
        r = input.nextDouble();
        double result = (pi*(r*r)*alpha)/360;
        System.out.println("The result is "+ result);
    }
}
