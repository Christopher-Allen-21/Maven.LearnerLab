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

    public List<Person> getPersonList(){
        return personList;
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
        CustomIterator<Person> iterator = new CustomIterator<Person>(personList);
        return iterator;
    }

    public class CustomIterator<E> implements Iterator<E>{
        int indexPosition = 0;
        List<E> internalList;

        public CustomIterator(List<E> internalList){
            this.internalList = internalList;
        }

        public boolean hasNext() {
            if(internalList.size() > indexPosition){
                return true;
            }
            else{
                return false;
            }
        }

        public E next() {
            E val = internalList.get(indexPosition);
            indexPosition++;
            return val;
        }

        public void remove() {

        }
    }
}
