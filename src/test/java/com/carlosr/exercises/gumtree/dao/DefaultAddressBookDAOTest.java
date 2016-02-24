package com.carlosr.exercises.gumtree.dao;

import com.carlosr.exercises.gumtree.converter.PersonConverter;
import com.carlosr.exercises.gumtree.converter.StubConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;

public class DefaultAddressBookDAOTest {

    private DefaultAddressBookDAO unitUnderTest;

    @Before
    public void setup() {
        PersonConverter stubConverter = new StubConverter();
        this.unitUnderTest = new DefaultAddressBookDAO(stubConverter, new DefaultResourceLoader());
    }

    @Test
    public void getAll_returns_the_right_elements_from_data_source() {
        int expectedNumElem = 5;
        Assert.assertEquals(expectedNumElem, this.unitUnderTest.getAll().size());
    }
}
