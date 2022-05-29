package com.company;

public class Araba {
    // class qualification
    private String renk;
    private int kapılar;
    private int tekerlek;
    private String motor;
    private String model;

    // Set and get methods for attributes to reach via private
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapılar() {
        return kapılar;
    }

    public void setKapılar(int kapılar) {
        if(kapılar < 0 ) System.out.println("Geçersiz kapı sayısı girdiniz!!");
        else{
            this.kapılar = kapılar;
            System.out.println("Arabanın kapı sayısı " + kapılar );
        }
    }

    public int getTekerlek() {
        return tekerlek;
    }

    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
