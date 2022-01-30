package com.company;
import java.util.Scanner;
public class Bank {

    public static void main(String[] args) {
        String userName,password;
        Scanner input = new Scanner(System.in);
        int choice;
        int right = 3;
        int balance = 2000;
        int price;
        System.out.println("Welcome Bank of Yours");
            while(right > 0){
                System.out.print("Please enter your user name: ");
                userName = input.nextLine();
                System.out.print("Please enter your password: ");
                password = input.nextLine();
                if (userName.equals("Mustafa23") && password.equals("12345")){

                    do{
                        System.out.println("\n1-withdraw money\n2-deposit money\n3-My balance\n4-Exit");
                        System.out.print("Please choose your process: ");
                        choice = input.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.print("How much money would you like to withdraw: ");
                                    price = input.nextInt();
                                    balance -= price;
                                    break;
                                case 2:
                                    System.out.print("How much money would you like to deposit: ");
                                    price = input.nextInt();
                                    balance += price;
                                    break;
                                case 3:
                                    System.out.print("Your current balance: " + balance);
                                    break;
                                case 4:
                                    System.out.println("You are logging out...");
                                    break;
                                default:
                                    System.out.println("Invalid choice!!!");
                                    break;
                            }
                    }while(choice != 4);
                    break;

                }else{
                        right--;
                        System.out.println("User name or password is invalid");
                        if (right == 0){
                            System.out.println("Your account was blocked!!!");
                            System.out.println("Please you contact your bank!!!");
                        }else{
                            System.out.println("You have "+right+" rights");
                        }
                }

            }
    }
}
