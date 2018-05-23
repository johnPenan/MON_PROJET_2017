/*
 * Creation : 15 mars 2017
 */
/**
 * 
 */
package com.mpsa.seph.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * TODO : Description
 * 
 * @author U512446
 */
public class TestAdder {

    /**
     * Test method for {@link com.mpsa.seph.sample.Adder#add(int, int)}.
     */
    @Test
    public void testAdd() {
        Adder adder = new Adder();
        assertNotNull(adder);
        assertEquals(2, adder.add(1, 1));
    }

    @Test
    public void testAdd1() {
        Adder adder = new Adder();
        assertNotNull(adder);
        assertEquals(3, adder.add(2, 1));
    }

}
