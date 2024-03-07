package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //given
        long expectedId = 101;
        String expectedName = "Jake";

        //when
        Person person = new Person(expectedId, expectedName);
        long actualId = person.getId();
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testSetName(){
        //given
        String expectedName = "Jake";
        Person person = new Person(null, null);
        Assert.assertNotEquals(expectedName, person.getName());

        //when
        person.setName(expectedName);
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedName, actualName);
    }

}
