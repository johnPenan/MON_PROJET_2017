/*
 * Creation : 16 mars 2017
 */
package com.jean.goumou.Mon_Projet_Maven;

import junit.framework.TestCase;

public class TestCalcul extends TestCase {
    Mon_Calcul d = new Mon_Calcul();

    // Test division
    public void testDivision() {
        assertNotNull(d);
        assertEquals(1.0f, d.division(4, 4));
    }

    // Test multiplication

    public void testMultiplication() {
        assertNotNull(d);
        assertEquals(4, d.multiplication(2, 2));
    }

    // Test susbtraction
    public void testsquareRoot() {
        assertNotNull(d);
        assertEquals(2.0f, d.squareRoot(4));
    }

}
