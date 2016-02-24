package com.carlosr.exercises.gumtree.converter;

import com.carlosr.exercises.gumtree.model.Gender;
import com.carlosr.exercises.gumtree.model.Person;
import org.springframework.stereotype.Component;

/**
 * StringToPerson implementations of Converter.
 */
@Component
public class StringToPersonConverter implements PersonConverter {

    /**
     * convert to Person entity.
     * @param name
     * @param gender
     * @param dob
     * @return
     */
    public Person convert(String name, String gender, String dob) {
        return new Person(name, Gender.valueOf(gender), null);
    }
}
