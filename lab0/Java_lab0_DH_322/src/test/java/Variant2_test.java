
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant2;
import lab0.Variant2.DAY_OF_WEEK;

public class Variant2_test {

    public static double EPS = 0.0000001;

    @Test
    public void inputOutputTest() {
        assertEquals(new Variant2().inputOutputTask(2), 0);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeInputOutputTest() {
        new Variant2().inputOutputTask(-2);
    }

    ////////////////////////////////////////////////

    @Test
    public void integerNumbersTest() {
        assertEquals(new Variant2().integerNumbersTask(100), 0);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeIntegerNumbersTest() {
        new Variant2().integerNumbersTask(-2);
    }

    ////////////////////////////////////////////////

    @Test
    public void booleanTest() {
        assertEquals(new Variant2().booleanTask(5), false);
    }

    ////////////////////////////////////////////////

    @Test
    public void ifTest() {
        assertEquals(new Variant2().ifTask(2), 0);
    }

    ////////////////////////////////////////////////

    @Test
    public void switchTest() {
        assertEquals(new Variant2().switchTask(3), DAY_OF_WEEK.MONDAY);
    }

    ////////////////////////////////////////////////

    @Test(expectedExceptions = AssertionError.class)
    public void forNegativeTest() {
        new Variant2().forTask(10);
    }

    ////////////////////////////////////////////////

    @Test
    public void forTest() {
        assertEquals(new Variant2().forTask(3), 0, EPS);
    }

    ////////////////////////////////////////////////

    @Test
    public void whileTest() {
        assertEquals(new Variant2().whileTask(10, 2), 0);
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeWhileTest() {
        new Variant2().whileTask(1, 2);
    }

    ////////////////////////////////////////////////

    @Test
    public void arrayTest() {
        assertEquals(new Variant2().arrayTask(new double[] { 10, 2, 3 }), 0);
    }

    ////////////////////////////////////////////////

    @Test
    public void twoDimensionArrayTest() {
        int[][] input = {
                { 2, 3, 6, 9, -9 },
                { 34, 98, -9, 2, 1 },
                { -4, 2, 1, 6, 1 },
                { -98, 8, 1, 5, 3 } };

        int[][] input23 = {
                { 2, 3, 6, 9, -9 },
                { -4, 2, 1, 6, 1 },
                { 34, 98, -9, 2, 1 },
                { -98, 8, 1, 5, 3 } };

        int[][] input14 = {
                { -98, 8, 1, 5, 3 },
                { -4, 2, 1, 6, 1 },
                { 34, 98, -9, 2, 1 },
                { 2, 3, 6, 9, -9 } };

        assertEquals(new Variant2().twoDimensionArrayTask(input, 2, 3), input23);
        assertEquals(new Variant2().twoDimensionArrayTask(input, 1, 4), input14);
    }

    @Test
    public void arrayTest2() {
        assertEquals(new int[] { 2, 3 }, new int[] { 2, 3 });
    }
}