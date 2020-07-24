/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class FarenheittocelsiusTest {
    Farenheittocelsius fa;
    
    public FarenheittocelsiusTest() {
    }
    
    @Before
    public void setUp() {
        fa = new Farenheittocelsius();
    }
    
    @After
    public void tearDown() {
        fa = null;
    }

    @Test
    public void testCelsius() {
    }

    @Test
    public void testFahrenheit()
    {
        double expectedResult = 5;
        double actualResult = fa.celsius(41.0);
        
        assertEquals(expectedResult, actualResult, 0);
    }
    
}
