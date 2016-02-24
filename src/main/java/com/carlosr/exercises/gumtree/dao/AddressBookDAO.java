package com.carlosr.exercises.gumtree.dao;

import com.carlosr.exercises.gumtree.model.Person;

import java.util.List;

/**
 * AddressBookDAO interface.
 */
public interface AddressBookDAO {
    List<Person> getAll();
}
