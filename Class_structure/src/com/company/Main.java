package com.company;

public class Main {

    public static void main(String[] args) {
	Teacher t1 = new Teacher("Mustafa","Math","112233");
    Teacher t2 = new Teacher("Musa","Chem","222222");
    Teacher t3 = new Teacher("Burakhan","Phy","33333");
    Course math = new Course("Math","102","Math");
    math.addTeacher(t1);
    Course chemistry = new Course("Chemistry","103","Chem");
    chemistry.addTeacher(t2);
    Course physics = new Course("Physics","104","Phy");
    physics.addTeacher(t3);

    Student s1 = new Student("Şaban","12345","4",math,chemistry,physics);
    s1.addBulkExamNote(45,65,82);
    s1.Verbals(60,70,80);
    s1.Calcunote();
    s1.isPass();



    }
}
