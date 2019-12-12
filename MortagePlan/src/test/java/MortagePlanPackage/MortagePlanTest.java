/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MortagePlanPackage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MortagePlanTest {
    @Test public void testMortagePlan() {
        Calculations calc = new Calculations();
        double expected = 18.871025;
        
		float monthCost = calc.calcMortage(1000, 5, 5);
		//1 expected result, 2 result, 3 delta
		assertEquals(expected, monthCost, 0.00001);
    }
}