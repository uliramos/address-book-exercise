package com.carlosr.exercises.gumtree.converter;

import com.carlosr.exercises.gumtree.model.Gender;
import com.carlosr.exercises.gumtree.model.Person;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
        return new Person(name, Gender.valueOf(gender.toLowerCase()), parseDateString(dob));
    }

    // helper methods

    private Date parseDateString(String str) {
        DateFormat formatter= new SimpleDateFormat("dd/MM/yy");
        try {
            return formatter.parse(str);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
