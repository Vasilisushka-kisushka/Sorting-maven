package epam.rd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class TestSingleElementArrayCase {
    Sorting sorting = new Sorting();

    private int[] unsortedArr;
    private int[] sortedArr;

    public TestSingleElementArrayCase(int[] sortedArr, int[] unsortedArr) {
        this.unsortedArr = unsortedArr;
        this.sortedArr = sortedArr;
    }

    @Parameterized.Parameters
    public static Collection input() {
        int[]one = new int[]{1};
        int[]two = new int[]{1};
        return Arrays.asList(new Object[][]{{one,two}});
    }

    @Test
    public void testSingleElementArrayCase(){
        sorting.sort(unsortedArr);
        boolean isEquals = Arrays.equals(unsortedArr,sortedArr);
        assertTrue(isEquals);
    }
}
