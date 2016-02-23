package com.carlosr.exercises.gumtree.dao;

import com.carlosr.exercises.gumtree.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Default implementations for AddressBookDAO.
 */
@Component
public class DefaultAddressBookDAO implements AddressBookDAO {

    private final AddressDataSource dataSource;

    /**
     * Constructor expecting the mandatory AddressDataSource dependency.
     * @param dataSource
     */
    @Autowired
    public DefaultAddressBookDAO(AddressDataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Get all person entities in the address book.
     * @return
     */
    public List<Person> getAll() {
        return null;
    }
}
