package com.carlosr.exercises.gumtree.dao;

import au.com.bytecode.opencsv.CSVReader;
import com.carlosr.exercises.gumtree.converter.PersonConverter;
import com.carlosr.exercises.gumtree.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Default implementations for AddressBookDAO.
 */
@Component
public class DefaultAddressBookDAO implements AddressBookDAO {

    public static final char SEPARATOR = ',';
    public static final String FILE_NAME = "AddressBook.csv";

    private final PersonConverter personConverter;

    private ResourceLoader resourceLoader;

    /**
     * Constructor expecting the mandatory AddressDataSource dependency.
     * @param personConverter
     */
    @Autowired
    public DefaultAddressBookDAO(PersonConverter personConverter, ResourceLoader resourceLoader) {
        this.personConverter = personConverter;
        this.resourceLoader = resourceLoader;
    }

    /**
     * Get all person entities in the address book.
     * @return
     */
    @Override
    public List<Person> getAll() {
        List<Person> personList = new ArrayList<>();
        CSVReader reader = null;
        String [] personFields;
        Resource resource = resourceLoader.getResource("classpath:/" + FILE_NAME);
        try {
            reader = new CSVReader(new InputStreamReader(resource.getInputStream()), SEPARATOR);

            while ((personFields = reader.readNext()) != null) {
                personList.add(this.personConverter.convert(personFields[0].trim(), personFields[1].trim(), personFields[2].trim()));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);

        } finally {
            try {
                reader.close();
            } catch (IOException ioe) {
                //log Exception
            }
        }
        return personList;
    }
}
