package com.besandr.foo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UtilTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void mustBeIllegalArgumentExceptionIfDivisorIsZero(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Divisor must not be zero");
        Util.division(3, 0);
    }

    @Test
    public void divisionMustReturn7(){
        assertEquals("Quotient must be 7", 7, Util.division(52.5, 7.5), 0);
    }

    @Test
    public void testGetDelta() {
        assertThat( Util.getDelta(23, 34), is(11));
    }

    @Test
    public void textRepresentationNumberMustReturnThirtySeven() {
        assertThat(Util.textRepresentationNumber(37), is("thirty-seven"));
    }
}