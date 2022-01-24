package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int month,day;
    Scanner inp = new Scanner(System.in);
    System.out.print("What is the month you were born: ");
    month = inp.nextInt();
    System.out.print("What is the day you were born: ");
    day = inp.nextInt();
    if(month == 1){
        if(1<=day && day<=31){
            if(day<=21){
                System.out.println("Oğlak");

            }else{
                System.out.println("Kova");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 2){
        if(1<=day && day<=28){
            if(day<=19){
                System.out.println("Kova");
            }else{
                System.out.println("Balık");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    } else if(month == 3){
        if(1<=day && day<=31){
            if(day<=20){
                System.out.println("Balık");
            }else{
                System.out.println("Koç");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 4){
        if(1<=day && day<=30){
            if(day<=20){
                System.out.println("Koç");
            }else{
                System.out.println("Boğa");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 5){
        if(1<=day && day<=31){
            if(day<=21){
                System.out.println("Boğa");
            }else{
                System.out.println("İkizler");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 6){
        if(1<=day && day<=30){
            if(day<=22){
                System.out.println("İkizler");
            }else{
                System.out.println("Yengeç");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 7){
        if(1<=day && day<=31){
            if(day<=22){
                System.out.println("Yengeç");
            }else{
                System.out.println("Aslan");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 8){
        if(1<=day && day<=31){
            if(day<=22){
                System.out.println("Aslna");
            }else{
                System.out.println("Başak");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 9){
        if(1<=day && day<=31){
            if(day<=22){
                System.out.println("Başak");
            }else{
                System.out.println("Terazi");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 10){
        if(1<=day && day<=30){
            if(day<=22){
                System.out.println("Terazi");
            }else{
                System.out.println("Akrep");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 11){
        if(1<=day && day<=30){
            if(day<=21){
                System.out.println("Akrep");
            }else{
                System.out.println("Yay");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else if(month == 12){
        if(1<=day && day<=31){
            if(day<=21){
                System.out.println("Yay");
            }else{
                System.out.println("Oğlak");
            }
        }else{
            System.out.println("You enter incorrect value!!!");
        }
    }else{
        System.out.println("Invalid login!!!");
    }
    }
}
