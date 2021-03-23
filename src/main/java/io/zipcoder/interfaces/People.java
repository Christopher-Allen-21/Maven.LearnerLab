package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable{

    List<Person> personList = new ArrayList<Person>();

    public People(List<Person> personList){
        this.personList = personList;
    }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        Person person = null;
        for(Person i : personList){
            if(i.getId() == id){
                person = i;
            }
        }
        return person;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        for(Person i : personList){
            if(i.getId() == id){
                personList.remove(i);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return personList.toArray(new Person[personList.size()]);
    }

    public Iterator iterator() {

    }
}
