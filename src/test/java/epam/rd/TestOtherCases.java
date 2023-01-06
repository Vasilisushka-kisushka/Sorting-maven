package epam.rd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class TestOtherCases {

        protected Sorting sorting = new Sorting();

        private final int[] unsortedArr;
        private final int[] sortedArr;

        public TestOtherCases(int[] sortedArr, int[] unsortedArr) {
            this.unsortedArr = unsortedArr;
            this.sortedArr = sortedArr;
        }

        @Parameterized.Parameters
        public static Collection input() {
            int[]one = new int[]{1,2,3};
            int[]two = new int[]{3,2,1};
            return Arrays.asList(new Object[][]{{one,two}});
        }

        @Test
        public void testOtherCases () {
            sorting.sort(unsortedArr);
            boolean isEquals = Arrays.equals( sortedArr,unsortedArr);
            assertTrue(isEquals);
        }
}
