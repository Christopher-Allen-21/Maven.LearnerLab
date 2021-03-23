package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest extends TestCase {

    @Test
    public void testImplementation(){
        Student student = new Student(001,"Chris",10);

        boolean expected = true;
        boolean actual = student instanceof Learner;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(001,"Chris",0);

        boolean expected = true;
        boolean actual = student instanceof Person;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLearn(){
        Student student = new Student(001,"Chris",0);

        double expected = 10.0;
        student.learn(10.0);

        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);
    }
}