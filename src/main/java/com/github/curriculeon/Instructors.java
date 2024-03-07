package com.github.curriculeon;

public final class Instructors extends People {
    private static Instructors INSTANCE = new Instructors();
    private Instructors(){
        this.add(new Instructor(1L, "Leon"));
        this.add(new Instructor(2L, "Kris"));
        this.add(new Instructor(3L, "Dolio"));
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }
}
