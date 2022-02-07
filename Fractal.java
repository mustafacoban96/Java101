package com.company;
import java.util.Scanner;
public class Fractal {
    static void fractal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int counter =0;
        while(true){
            System.out.print(number+" ");
            number-=5;
            counter +=1;
            if (number <= 0){
                for (int i = 0;i<=counter;i++){
                    System.out.print(number+" ");
                    number+=5;

                }break;
            }
        }
    }

    public static void main(String[] args) {

        fractal();
    }
}
