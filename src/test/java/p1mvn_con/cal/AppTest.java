package p1mvn_con.cal;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testadd() {
    	
    	calculator calc = new calculator();
    	assertEquals(50, calc.add(20, 30));
    	assertEquals(-10, calc.substract(20, 30));
    	
    }
    
    public void testsub() {
    	calculator calc = new calculator();
    	assertEquals(-10, calc.substract(20, 30));
    }
   
    public void testmul() {
    	calculator calc = new calculator();
    	assertEquals(600, calc.multiply(20, 30));
    }
    
    public void testdiv() {
    	calculator calc = new calculator();
    	assertEquals(4, calc.divide(20, 5));
    }
    
}
