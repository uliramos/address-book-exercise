package com.carlosr.exercises.gumtree.service;

import com.carlosr.exercises.gumtree.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Decorator class to cath all Runtime exception that coulbe be coming the call chain.
 */
@Component
public class ServiceExceptionHandler implements AddressBookService {

    private AddressBookService defaultAddressBookService;

    @Autowired
    public ServiceExceptionHandler(AddressBookService defaultAddressBookService) {
        this.defaultAddressBookService = defaultAddressBookService;
    }

    @Override
    public Long findNumberOfMales() {
        try {
            return this.defaultAddressBookService.findNumberOfMales();

        } catch (RuntimeException e) {
           // log error
           return null;
        }
    }

    @Override
    public Person findOldestPerson() {
        try {
            return this.defaultAddressBookService.findOldestPerson();

        } catch (RuntimeException e) {
            // log error
            return null;
        }
    }

    @Override
    public Long calculateDaysBetweenDOBs(String name, String otherName) {
        try {
            return this.defaultAddressBookService.calculateDaysBetweenDOBs(name, otherName);

        } catch (RuntimeException e) {
            // log error
            return null;
        }
    }
}
