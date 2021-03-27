package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable{

    List<E> personList = new ArrayList<E>();

    public People(List<E> personList){
        this.personList = personList;
    }

    public People(){

    }

    public void add(E person){
        personList.add(person);
    }

    public List<E> getPersonList(){
        return personList;
    }

    public E findById(long id){
        E person = null;
        for(E i : personList){
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

    public abstract E[] getArray();


    public Iterator iterator() {
        CustomIterator<E> iterator = new CustomIterator<E>(personList);
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
