package com.carlosr.exercises.gumtree.service;

import com.carlosr.exercises.gumtree.dao.AddressBookDAO;
import com.carlosr.exercises.gumtree.model.Gender;
import com.carlosr.exercises.gumtree.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
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
     * Find the number of males present in the Address Book.
     * @return
     */
    @Override
    public Long findNumberOfMales() {
        List<Person> personList = this.addressBookDAO.getAll();
        long result = personList.stream().filter(p  -> p.getGender() == Gender.male)
                                         .count();
        return result;
    }

    /**
     * Find the oldest person present in the Address Book.
     * @return
     */
    @Override
    public Person findOldestPerson() {
        List<Person> personList = this.addressBookDAO.getAll();

        return personList.stream().min((p1, p2) -> p1.getDob()
                                  .compareTo(p2.getDob())).get();
    }

    /**
     * Find the oldest person present in the Address Book.
     * @return
     */
    @Override
    public Long calculateDaysBetweenDOBs() {
        List<Person> personList = this.addressBookDAO.getAll();

        Person person = personList.stream().filter(p -> p.getName()
                                           .equals("Bill McKnight"))
                                           .findFirst()
                                           .get();

        Person otherPerson = personList.stream().filter(p -> p.getName()
                                                .equals("Paul Robinson"))
                                                .findFirst()
                                                .get();

        LocalDate personDate = person.getDob().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate otherPersonDate = otherPerson.getDob().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        return ChronoUnit.DAYS.between(personDate, otherPersonDate);
    }
}
