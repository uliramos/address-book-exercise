package com.carlosr.exercises.gumtree.service;


import com.carlosr.exercises.gumtree.AddressBookExerciseApplication;
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
}
