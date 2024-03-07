package com.github.curriculeon;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {
    @Test
    public void testImplementation(){
        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean isTeacher = instructor instanceof Teacher;

        //then
        Assert.assertTrue(isTeacher);
    }
    @Test
    public void testInheritance(){
        //given
        Instructor instructor = new Instructor(null, null);

        //when
        boolean isPerson = instructor instanceof Person;

        //then
        Assert.assertTrue(isPerson);
    }
    @Test
    public void testTeach(){
        //given
        Instructor instructor = new Instructor(null, null);
        Student student = new Student(null, null);
        double lectureTime = 50.0;
        double expectedStudyTime = lectureTime;

        //when
        instructor.teach(student, lectureTime);
        double actualStudyTime = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.001);
    }
    @Test
    public void testLecture(){
        //given
        Instructor instructor = new Instructor(null, null);
        Student student1 = new Student(null, null);
        Student student2 = new Student(null, null);
        Student student3 = new Student(null, null);
        Student student4 = new Student(null, null);
        Student[] students = new Student[]{student1, student2, student3, student4};
        double lectureTime = students.length;
        double expectedStudyTime = lectureTime / students.length;
        for(Student student : students) {
            Assert.assertNotEquals(expectedStudyTime, student.getTotalStudyTime());
        }

        //when
        instructor.lecture(students, lectureTime);
        for(Student student : students){
            double actualStudyTime = student.getTotalStudyTime();

            //then
            Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.001);
        }
    }

}