/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class Lab3Test {

    public Lab3Test() {
    }

    /**
     * Test of main method, of class Lab3.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of calc_grades method, of class Lab3.
     */
    @Test
    public void testCalc_grades() {
        InputStream old_InputStream = System.in;
        InputStream new_InputStream = new ByteArrayInputStream("0\n52\n50\n55\n-1".getBytes());
        System.setIn(new_InputStream);
        Lab3 test_1 = new Lab3();
        //test_1.calc_grades();
        String result = test_1.calc_grades();
        String expected = "F";
        assertEquals(expected, result);
        System.setIn(old_InputStream);
    }
}
