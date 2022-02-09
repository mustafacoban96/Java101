package com.company;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbal;
    double result;

    // Constructer
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        int verbal = 0;
        double result = 0.0;

    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
            System.out.println("Teacher and Course matched.");

        }else {
            System.out.println("No match.");
        }
    }

    void printTeacherInfo(){

        this.teacher.printt();
    }
}
