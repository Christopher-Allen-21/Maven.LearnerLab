package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public final class Students extends People<Student>{

    private static final Students INSTANCE = new Students();
    private Student person1 = new Student(001,"Chris",0);
    private Student person2 = new Student(002,"Rob",0);
    private Student person3 = new Student(003,"Steve",0);
    private Student person4 = new Student(004,"Elizabeth",0);
    private List<Student> personList = new ArrayList<Student>();


    private Students(){
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
    }

    public Student[] getArray() {
        return personList.toArray(new Student[personList.size()]);
    }

    public static Students getInstance(){
        return INSTANCE;
    }


    public Student getStudent(int i) {
        return personList.get(i);
    }

    public int numberOfStudents() {
        return personList.size();
    }
}
