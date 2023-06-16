package jlmdev.YouTube_JUnit_5_Demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void addTwoPlusTwoEqualsFour()
    {
    	SimpleCalculator calculator = new SimpleCalculator();
        calculator.add(2, 2);
        assertEquals(4, calculator.add(2, 2));
    }
}
