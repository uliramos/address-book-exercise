package com.carlosr.exercises.gumtree.service;


import com.carlosr.exercises.gumtree.AddressBookExerciseApplication;
import com.carlosr.exercises.gumtree.model.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AddressBookExerciseApplication.class)
public class DefaultAddressBookServiceTest {

    @Autowired
    private DefaultAddressBookService unitUnderTest;

    @Test
    public void findOldestMale_returns_the_right_elements() {
        int expectedNumElem = 3;

        Assert.assertEquals(expectedNumElem, this.unitUnderTest.findNumberOfMales());
    }

    @Test
    public void findOldestPerson_returns_the_right_person() {
        Person person = this.unitUnderTest.findOldestPerson();

        Assert.assertEquals("Wes Jackson", person.getName());
    }

    @Test
    public void calculateDaysBetweenDOBs_returns_the_right_number_of_days() {
        int expectedDays = 2862;
        long days = this.unitUnderTest.calculateDaysBetweenDOBs();

        Assert.assertEquals(expectedDays, days);
    }
}
