package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void InstructorTest1(){
        Instructors myInstructors = Instructors.getInstance();

        Instructor instructor = myInstructors.getInstructor(0);

        Assert.assertEquals(instructor.getName(),"Nobles");

    }

    @Test
    public void InstructorTest2(){
        Instructors myInstructors = Instructors.getInstance();

        Instructor instructor = myInstructors.getInstructor(1);

        Assert.assertEquals(instructor.getName(),"Dolio");

    }

    @Test
    public void InstructorTest3(){
        Instructors myInstructors = Instructors.getInstance();

        Instructor instructor = myInstructors.getInstructor(2);

        Assert.assertEquals(instructor.getName(),"Younger");

    }
}