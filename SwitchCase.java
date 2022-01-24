package com.company;
import java.util.Scanner;
public class SwitchCase {

    public static void main(String[] args) {
	int a, b,process;

        Scanner proc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a = proc.nextInt();

        System.out.print("Enter second number: ");
        b = proc.nextInt();

        System.out.println("1-multiplication\n2-addition\n3-extraction\n4-division");
        System.out.print("Enter your process: ");
        process = proc.nextInt();

        switch (process){
            case 1:
                System.out.println(a*b);
                break;
            case 2:
                System.out.println(a+b);
                break;
            case 3:
                System.out.println(a-b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid process!!!");
                break;
        }
    }
}
