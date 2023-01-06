package epam.rd;

import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class TestNullCase {

    Sorting sorting = new Sorting();

    private int[] unsortedArr;
    private int[] sortedArr;

    @Parameterized.Parameters
    public static Collection input() {
        int[]one = null;
        return Arrays.asList(new Object[]{one});
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(unsortedArr);
    }

}