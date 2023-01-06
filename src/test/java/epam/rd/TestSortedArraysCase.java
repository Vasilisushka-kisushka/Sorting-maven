package epam.rd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestSortedArraysCase {
    protected Sorting sorting = new Sorting();

    private final int[] unsortedArr;
    private final int[] sortedArr;

    public TestSortedArraysCase(int[] sortedArr, int[] unsortedArr) {
        this.unsortedArr = unsortedArr;
        this.sortedArr = sortedArr;
    }

    @Parameterized.Parameters
    public static Collection input() {
        int[]one = new int[]{1,2,3};
        int[]two = new int[]{1,2,3};
        return Arrays.asList(new Object[][]{{one,two}});
    }

    @Test
    public void testSortedArraysCase() {
       sorting.sort(unsortedArr);
        boolean isEquals = Arrays.equals( sortedArr,unsortedArr);
        assertTrue(isEquals);
    }
}
