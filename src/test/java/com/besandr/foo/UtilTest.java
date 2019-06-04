package com.besandr.foo;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void testGetDelta() {
        assertEquals("The delta must be eleven",11,  new Util().getDelta(23, 34), 0);
    }
}