package com.carlosr.exercises.gumtree.service;

import com.carlosr.exercises.gumtree.dao.AddressBookDAO;
import com.carlosr.exercises.gumtree.model.Gender;
import com.carlosr.exercises.gumtree.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
     * Find the oldest male present in the Address Book.
     * @return
     */
    public long findNumberOfMales() {
        List<Person> personList = this.addressBookDAO.getAll();
        long result = personList.stream().filter(p1  -> p1.getGender() == Gender.male)
                                         .count();
        return result;
    }
}
