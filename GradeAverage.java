package com.company;
import java.util.Scanner;
public class GradeAverage {

    public static void main(String[] args) {
      float mat, fiz, kim, turkce, tarih, muzik;
      int dersSayisi = 6;
      Scanner not = new Scanner(System.in);
      System.out.print("Enter your math grade: ");
      mat = not.nextFloat();
      System.out.print("Enter your psyhic grade: ");
      fiz = not.nextFloat();
      System.out.print("Enter your chemstiry grade: ");
      kim = not.nextFloat();
      System.out.print("Enter your Turkish grade: ");
      turkce = not.nextFloat();
      System.out.print("Enter your history grade: ");
      tarih = not.nextFloat();
      System.out.print("Enter your music grade: ");
      muzik = not.nextFloat();
      float average = (mat+ fiz+ kim+ turkce+ tarih+ muzik)/dersSayisi;
      System.out.println("The average is "+ average);
      String limit = (average >= 60) ? "Gectiniz" : "Kaldınız";
      System.out.println(limit);
    }
}
