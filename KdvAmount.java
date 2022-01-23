package com.company;
import java.util.Scanner;
public class KdvAmount {

    public static void main(String[] args) {
	double kdv = 0.18;
    double price, kprice;
    Scanner fiyat = new Scanner(System.in);
    System.out.print("Enter the price: ");
    price = fiyat.nextDouble();
    kprice = (kdv*price)+price;
    System.out.println("KDV'siz fiyat: "+price);
    System.out.println("KDV'li fiyat: "+kprice);
    System.out.print("KDV tutarı: "+ (kdv*price));





    }
}
