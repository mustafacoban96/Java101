package com.company;
import java.util.Scanner;
public class Machine {
    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would like to enter:");
        int numbers = input.nextInt();
        double result = 0.0;
        for (int i = 1; i<=numbers; i++){
            Scanner inp = new Scanner(System.in);
            System.out.print(i+". number: ");
            int number = inp.nextInt();
            result += number;
        }
        System.out.println("Result: "+ result);

    }
    static void ext(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would like to enter :");
        int numbers = input.nextInt();
        double result = 0.0;
        for (int i = 1; i<=numbers; i++){
            Scanner inp = new Scanner(System.in);
            System.out.print(i+". number: ");
            int number = inp.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Result: "+ result);

    }
    static void mult(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to enter: ");
        int numbers = input.nextInt();
        double result = 1;
        for(int i = 1; i <= numbers; i++){
            Scanner inp = new Scanner(System.in);
            System.out.print(i+". number: ");
            int number = inp.nextInt();
            result *= number;
            if (number == 0){
                result = 0;
                break;
            }

        }
        System.out.println("Result: "+result);

    }
    static void div(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers would you like to enter: ");
        int numbers = input.nextInt();
        double result=0.0;
        for (int i = 1; i <= numbers; i++){
            Scanner inp = new Scanner(System.in);
            System.out.print(i+". number: ");
            int number = inp.nextInt();
            if(i !=1 && number == 0){
                System.out.println("Divider can not be zero!");
                break;
            }else{
                if (i == 1 ){
                    result = number;
                    continue;
                }
                result /= number;
            }System.out.println("Result: "+result);

        }


    }
    static void expo(){
        Scanner input = new Scanner(System.in);
        int base, power,a = 1;
        System.out.print("Enter the base: ");
        base = input.nextInt();
        System.out.print("Enter the power: ");
        power = input.nextInt();
        for(int i = 1; i <= power; i++){
            a *= base;
        }
        System.out.println("Result: "+ a);

    }
    static void fac(){
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        for(int i = 1; i <= number; i++){
            result *= i;

        }
        System.out.println("Result: "+result);
    }
    static void mod(){
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the divided: ");
        num1 = input.nextInt();
        System.out.print("Enter the divider: ");
        num2 = input.nextInt();
        if (num2 == 0){
            System.out.println("Divider can not be zero!");
        }
        else{
            System.out.println("Result: "+(num1%num2));
        }
    }
    static void rect(){
        int side1, side2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        side1 = inp.nextInt();
        System.out.print("Enter the second side: ");
        side2 = inp.nextInt();
        double area = side1*side2;
        double circum = 2*(side1+side2);
        if (side1 <= 0 || side2 <= 0){
            System.out.println("Invalid value(s)");
        }else{
            System.out.println("Area: "+area);
            System.out.println("Circumference: "+circum);
        }
    }
    static void star(){
        for (int i = 1; i <=10; i++){
            System.out.print("*-");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello!");
        String menu = ("1-Summation\n" +
                "2-Extraction\n" +
                "3-Multiplication\n" +
                "4-Division\n" +
                "5-Exponentiation\n"+
                "6-Factorial\n"+
                "7-Taking mode\n"+
                "8-Area and circumference of rectangle\n");
        while(true){
            star();
            System.out.println("\n"+menu);
            star();
            System.out.print("\nPlease choose process:");
            int select = input.nextInt();
            if (select==0) {
                System.out.println("Have a good day!");
                break;
            }
            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    ext();
                    break;
                case 3:
                    mult();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    expo();
                    break;
                case 6:
                    fac();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rect();
                    break;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }
}
