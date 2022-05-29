package com.company;

public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefonNo;



    // obje oluşturulurken ilk çağrılan metoddur constructure.
    public Account(){
        /*System.out.println("Kendi yazdığımız Constructure...");*/
        this("No info",0.0,"No info","No info","No info"); /*default values for objects*/
    }
    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo){
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }


// setter and getter funcs,
    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }
    public void paraYatır(double miktar){
        bakiye += miktar;
        System.out.println("Yeni Bakiye = " + bakiye);
    }
    public void paraCekme(double miktar){
        if (miktar > 1500){
            System.out.println("You can't withdraw money over 1500");
        }
        if(bakiye - miktar < 0 ){
            System.out.println("You don't have enough money that you want in your account...");
        }
        else {
            bakiye -= miktar;
            System.out.println("Yeni Bakiye = " + bakiye);
        }
    }
}


