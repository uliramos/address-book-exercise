package com.carlosr.exercises.gumtree.converter;

import com.carlosr.exercises.gumtree.model.Gender;
import com.carlosr.exercises.gumtree.model.Person;

import java.util.Date;

/**
 * StubConverter to help testing.
 */
public class StubConverter implements PersonConverter {

    @Override
    public Person convert(String name, String gender, String dob) {
        return new Person("test", Gender.female, new Date());
    }
}
