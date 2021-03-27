package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    @Test
    public void testImplementation(){
        Instructor instructor = Educator.NOBLES.getInstructor();

        boolean expected = true;
        boolean actual = instructor instanceof Teacher;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = Educator.DOLIO.getInstructor();

        boolean expected = true;
        boolean actual = instructor instanceof Person;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testTeach(){
        Instructor instructor = Educator.YOUNGER.getInstructor();
        Learner learner = new Student(002,"Chris",0);

        double expected = 5;
        instructor.teach(learner,5);

        double actual = learner.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);
    }

    @Test
    public void testLecture(){
        Instructor instructor = Educator.NOBLES.getInstructor();
        Learner learner1 = new Student(002,"Chris",0);
        Learner learner2 = new Student(003,"Rob",0);
        Learner learner3 = new Student(004,"Steve",0);
        Learner[] learners = {learner1, learner2, learner3};

        double expected1 = 1;
        double expected2 = 1;
        double expected3 = 1;

        instructor.lecture(learners,3);

        double actual1 = learner1.getTotalStudyTime();
        double actual2 = learner2.getTotalStudyTime();
        double actual3 = learner3.getTotalStudyTime();

        Assert.assertEquals(expected1,actual1,0);
        Assert.assertEquals(expected2,actual2,0);
        Assert.assertEquals(expected3,actual3,0);
    }
}