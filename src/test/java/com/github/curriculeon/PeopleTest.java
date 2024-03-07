package com.github.curriculeon;


import org.junit.Assert;
import org.junit.Test;

public class PeopleTest {
    @Test
    public void testAdd(){

        //given
        People people = new People();
        Person person = new Person(null, null);
        Assert.assertFalse(people.contains(person));


        //when
        people.add(person);

        //then
        Assert.assertTrue(people.contains(person));
    }
    @Test
    public void testRemove(){
        //given
        People people = new People();
        Person person = new Person(null, null);
        people.add(person);
        Assert.assertTrue(people.contains(person));

        //when
        people.remove(person);

        //then
        Assert.assertFalse(people.contains(person));
    }
    @Test
    public void testFindById(){
        //given
        People people = new People();
        Person person = new Person(1L, null);
        Person expectedPerson = person;
        people.add(person);
        Assert.assertTrue(people.contains(person));

        //when
        Person actualPerson = people.findById(1);

        //then
        Assert.assertEquals(expectedPerson, actualPerson);

    }

}