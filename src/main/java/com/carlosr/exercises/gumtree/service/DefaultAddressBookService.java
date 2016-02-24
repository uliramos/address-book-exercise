package com.carlosr.exercises.gumtree.service;

import com.carlosr.exercises.gumtree.dao.AddressBookDAO;
import com.carlosr.exercises.gumtree.model.Gender;
import com.carlosr.exercises.gumtree.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * Default implementation of AddressBookService.
 */
@Component
public class DefaultAddressBookService implements AddressBookService {

    private final AddressBookDAO addressBookDAO;

    @Autowired
    public DefaultAddressBookService(AddressBookDAO addressBookDAO) {
        this.addressBookDAO = addressBookDAO;
    }

    /**
     * Find the number of males present in the Address Book.
     * @return
     */
    public long findNumberOfMales() {
        List<Person> personList = this.addressBookDAO.getAll();
        long result = personList.stream().filter(p1  -> p1.getGender() == Gender.male)
                                         .count();
        return result;
    }

    /**
     * Find the oldest person present in the Address Book.
     * @return
     */
    public Person findOldestPerson() {
        List<Person> personList = this.addressBookDAO.getAll();

        return personList.stream().min((p1, p2) -> p1.getDob().compareTo(p2.getDob())).get();

    }
}
