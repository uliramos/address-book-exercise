package com.carlosr.exercises.gumtree.dao;

/**
 * Stub implementation of AddressDataSource to help testing..
 */
public class StubAddressDataSource implements AddressDataSource {

    @Override
    public String[] getData() {
        return new String[] {"Person1", "female" , "10/12/1977",
                            "Person2", "male" , "11/01/1980",
                            "Person3", "male" , "01/01/1967"};
    }
}
