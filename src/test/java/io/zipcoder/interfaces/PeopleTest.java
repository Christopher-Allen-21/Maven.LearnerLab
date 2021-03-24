package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PeopleTest extends TestCase {

    @Test
    public void testAdd(){
        Person person1 = new Person(001,"Chris");
        Person person2 = new Person(002,"Rob");
        Person person3 = new Person(003,"Steve");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);

        People people = new People(personList);
        people.add(person3);

        personList.add(person3);

        List<Person> expected = personList;
        List<Person> actual = people.getPersonList();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        Person person1 = new Person(001,"Chris");
        Person person2 = new Person(002,"Rob");
        Person person3 = new Person(003,"Steve");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        People people = new People(personList);
        people.remove(person3);

        personList.remove(person3);

        List<Person> expected = personList;
        List<Person> actual = people.getPersonList();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindById(){
        Person person1 = new Person(001,"Chris");
        Person person2 = new Person(002,"Rob");
        List<Person> personList = new ArrayList<Person>();
        personList.add(person1);
        personList.add(person2);

        People people = new People(personList);

        Person expected = person2;
        Person actual = people.findById(002);

        Assert.assertEquals(expected,actual);
    }

}