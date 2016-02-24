package com.carlosr.exercises.gumtree.converter;

import com.carlosr.exercises.gumtree.model.Person;

/**
 * Converter.
 */
public interface PersonConverter {
    Person convert(String name, String gender, String dob);
}
