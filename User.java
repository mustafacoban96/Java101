package com.company;
import java.util.Scanner;

public class User {

    public static void main(String[] args) {
	String userName,password,password2;
    int change;
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter user name: ");
    userName = inp.nextLine();
    System.out.print("Enter password: ");
    password = inp.nextLine();
    if (userName.equals("mustafa") && password.equals("coban123")){
        System.out.println("You are logged in");
    }else{
        System.out.println("Invalid login!!");
        System.out.println("1-reset your password\n2-Quit");
        System.out.println("Your choice: ");
        change = inp.nextInt();
        if (change == 1){
            System.out.print("Enter new password: ");
            Scanner inpt = new Scanner(System.in); // I created a new scanner object.
            password2 = inpt.nextLine();
            if (password2.equals("coban123")){
                System.out.println("password can not same previous password");
            }else{
                password = password2;
                System.out.println("Your password is changed");
                System.out.println(password);
            }

        }else{
            System.out.println("You quit...");
        }

    }
    }
}
