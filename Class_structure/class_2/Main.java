package com.company;

public class Main {

    public static void main(String[] args) {
	Account account1 = new Account(); /*Consturcute burada kullanılır*/
        Account account2 = new Account("1231312",1000.0,"Mustafa coban","asdsad@gmail","123123434554");
        Account account3 = new Account();
    account1.setHesapNo("123445567");
    account1.setBakiye(1000.0);
    account1.setIsim("Mustafa Coban");
    account1.setEmail("mustafacoban@gmail.com");
    account1.setTelefonNo("2344354512");

        System.out.println("Bakiyee " + account1.getBakiye());
        System.out.println("hesap adı: " + account2.getIsim());
        System.out.println("isim: " + account3.getIsim());
    }
}
