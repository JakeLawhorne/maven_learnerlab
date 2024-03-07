package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    private List<Person> personList = new ArrayList<>();
    public void add(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        for(Person person : personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }
    public boolean contains(Person person){
        return personList.contains(person);
    }
    public void remove(Person person){
        personList.remove(person);
    }
    public void removeById(long id){
        personList.remove(this.findById(id));
    }
    public void removeAll(){
        personList.clear();
    }
    public int count(){
        return personList.size();
    }
    public Person[] toArray(){
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
