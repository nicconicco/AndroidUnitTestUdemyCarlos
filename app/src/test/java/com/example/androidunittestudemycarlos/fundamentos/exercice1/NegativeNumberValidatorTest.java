package com.example.androidunittestudemycarlos.fundamentos.exercice1;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NegativeNumberValidatorTest {

    //SYSTEM UNDER TEST
    NegativeNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new NegativeNumberValidator();
    }

    @Test
    public void test1() {
        boolean result = SUT.isNegative(-1);
        assertThat(result, is(true));
    }

    @Test
    public void test2() {
        boolean result = SUT.isNegative(0);
        assertThat(result, is(false));
    }

    @Test
    public void test3() {
        boolean result = SUT.isNegative(1);
        assertThat(result, is(false));
    }
}
