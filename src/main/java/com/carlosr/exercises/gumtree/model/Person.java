package com.carlosr.exercises.gumtree.model;

import java.util.Date;

/**
 * Person entity definition.
 */
public class Person {
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

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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
