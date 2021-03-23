package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {


    @Test
    public void constructorTest(){
        Person person = new Person(001,"Chris");

        long expectedID = 001;
        String expectedName = "Chris";

        long actualID = person.getId();
        String actualName = person.getName();

        Assert.assertEquals(expectedID,actualID);
        Assert.assertEquals(expectedName,actualName);
    }

    @Test
    public void setNameTest(){
        Person person = new Person(001,"Chris");

        String expectedName = "Rob";

        person.setName("Rob");

        String actualName = person.getName();

        Assert.assertEquals(expectedName,actualName);
    }
}
