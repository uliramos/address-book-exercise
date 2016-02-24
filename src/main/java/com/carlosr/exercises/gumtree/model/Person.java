package com.carlosr.exercises.gumtree.model;

import java.util.Date;

/**
 * Person entity definition.
 */
public final class Person {
    private String name;
    private Gender gender;
    private Date dob;

    /**
     * Constructor.
     * @param name
     * @param gender
     * @param dob
     */
    public Person(String name, Gender gender, Date dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    // getters and setters //

    public String getName() {

        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }
}
