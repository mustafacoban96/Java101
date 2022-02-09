package com.company;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;
    double vereffect;
    double noteffect;

    //Constructure
    Student(String name, String stuNo, String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.vereffect = 0.2;
        this.noteffect = 0.8;
        this.isPass = false;

    }
    // We use note attribute of Course class because c1 object of Course class.
    void addBulkExamNote(int note1, int note2, int note3){

        if (note1 >=0 && note1 <= 100){
            c1.note = note1;
        }if (note2 >=0 && note2 <= 100){
            c2.note = note2;
        }if (note3 >=0 && note3 <= 100){
            c3.note = note3;
        }

    }
    void Verbals(int ver1, int ver2, int ver3){
        c1.verbal = ver1;
        c2.verbal = ver2;
        c3.verbal = ver3;
    }
    void Calcunote(){
        c1.result = (c1.note*0.8)+(c1.verbal*0.2);
        c2.result = (c2.note*0.8)+(c2.verbal*0.2);
        c3.result = (c3.note*0.8)+(c3.verbal*0.2);
    }


    void isPass(){
        this.average = (c1.result+ c2.result+ c3.result)/3.0;
        printnote();
        System.out.println("*************");
        if(this.average<50){
            System.out.println("You failed.");
            this.isPass = false;
        }else{
            System.out.println("You passed.");
            this.isPass = true;
        }

    }

    void printnote(){
        System.out.println(c1.name+" Note:"+c1.note+"\t\tVerbal: "+c1.verbal);
        System.out.println(c2.name+" Note:"+c2.note+"\t\tVerbal: "+c2.verbal);
        System.out.println(c3.name+" Note:"+c3.note+"\t\tVerbal: "+c3.verbal);
        System.out.println("Your avreage: "+this.average);
    }





}
