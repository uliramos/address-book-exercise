package com.carlosr.exercises.gumtree.service;

import com.carlosr.exercises.gumtree.model.Person;

/**
 *AddressBookService interface.
 */
public interface AddressBookService {
    Long findNumberOfMales();

    Person findOldestPerson();

    Long calculateDaysBetweenDOBs();
}
