package com.company;

import java.util.Scanner;

public class CourseGrade {

    public static void main(String[] args) {
	int math, psy, tur, chem, music;
    double average;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter maths grade: ");
    math = input.nextInt();
    System.out.print("Enter psyhics grade: ");
    psy = input.nextInt();
    System.out.print("Enter Turkish grade: ");
    tur = input.nextInt();
    System.out.print("Enter chemistry grade: ");
    chem = input.nextInt();
    System.out.print("Enter music grade: ");
    music = input.nextInt();
    if((0<=math && math<=100) && (0<=psy && psy<=100) && (0<=tur&&tur<=100) && (0<=chem&&chem<=100) && (0<=music&&music<=100)){
        average = (math+psy+tur+chem+music)/5;
        System.out.println("your average: "+average);
        if (average>=55){
            System.out.println("You passed");
        }else{
            System.out.println("You failed");
        }

    }else{
        System.out.println("Your input incorrect!!");
    }

    }
}
