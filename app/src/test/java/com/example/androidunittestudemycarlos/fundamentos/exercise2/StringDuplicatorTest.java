package com.example.androidunittestudemycarlos.fundamentos.exercise2;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setup() throws Exception {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyString_emptyStringReturned() throws Exception {
        String result = SUT.duplicate("");
        assertThat(result, is(""));
    }

    @Test
    public void duplicate_singleCharacter_duplicatedStringReturned() throws Exception {
        String result = SUT.duplicate("a");
        assertThat(result, is("aa"));
    }

    @Test
    public void duplicate_longString_duplicatedStringReturned() throws Exception {
        String result = SUT.duplicate("Carlos Nicolau");
        assertThat(result, is("Carlos NicolauCarlos Nicolau"));
    }
}
