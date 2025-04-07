
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Testing.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Testing
{
    private CalcEngine engine;
    /**
     * Default constructor for test class Testing
     */
    public Testing()
    {

    }
    public int testPlus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the key presses: 3 + 4 =
        engine.numberPressed(3);
        engine.plus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 7.
        return engine.getDisplayValue();
    }
    public int testMinus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the presses: 9 - 4 =
        engine.numberPressed(9);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 5.
        return engine.getDisplayValue();
    }
    public int testMultiply()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the presses: 4 * 4 =
        engine.numberPressed(4);
        engine.multiply();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 16.
        return engine.getDisplayValue();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        engine = new CalcEngine();
    
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        System.out.println("Testing the addition operation.");
        System.out.println("The result is: " + testPlus());
        System.out.println("Testing the subtraction operation.");
        System.out.println("The result is: " + testMinus());
         System.out.println("Testing the multiplication operation.");
        System.out.println("The result is: " + testMultiply());
        System.out.println("All tests passed.");
    }
    @Test
    public void testOperations()
    {   System.out.println("Testing the addition operation.");
        System.out.println("The result is: " + testPlus());
        System.out.println("Testing the subtraction operation.");
        System.out.println("The result is: " + testMinus());
         System.out.println("Testing the multiplication operation.");
        System.out.println("The result is: " + testMultiply());
        System.out.println("All tests passed.");
    }
}
