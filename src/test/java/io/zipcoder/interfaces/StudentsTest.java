package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    @Test
    public void StudentsTest1(){
        Students myStudents = Students.getInstance();

        Student s = myStudents.getStudent(0);

        Assert.assertEquals(s.getName(),"Chris");

    }

    @Test
    public void StudentsTest2(){
        Students myStudents = Students.getInstance();

        Student s = myStudents.getStudent(1);

        Assert.assertEquals(s.getName(),"Rob");

    }

    @Test
    public void StudentsTest3(){
        Students myStudents = Students.getInstance();

        Student s = myStudents.getStudent(2);

        Assert.assertEquals(s.getName(),"Steve");

    }
}