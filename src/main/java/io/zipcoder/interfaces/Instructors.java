package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();
    List<Instructor> instructorList = new ArrayList<Instructor>();
    Instructor instructor1 = new Instructor(001,"Nobles");
    Instructor instructor2 = new Instructor(002,"Dolio");
    Instructor instructor3 = new Instructor(003,"Younger");

    public Instructors(){
        instructorList.add(instructor1);
        instructorList.add(instructor2);
        instructorList.add(instructor3);
    }

    public Instructor[] getArray() {
        return instructorList.toArray(new Instructor[instructorList.size()]);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor getInstructor(int i) {
        return instructorList.get(i);
    }

    public Instructor getInstructorByID(long id) {
        for(int i=0;i<instructorList.size();i++){
            if(instructorList.get(i).getId() == id){
                return instructorList.get(i);
            }
        }
        return null;
    }

    public int numberOfInstructors() {
        return instructorList.size();
    }

}
