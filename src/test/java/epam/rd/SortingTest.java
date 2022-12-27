package epam.rd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class SortingTest {

    Sorting sorting = new Sorting();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        sorting.sort(null);
    }

    @Test
    public void testEmptyCase() {
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{};

        sorting.sort(arr1);
        boolean isEquals = Arrays.equals(arr1,arr2);
        assertTrue(isEquals);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] arr1 = new int[]{1};
        int[] arr2 = new int[]{1};

        sorting.sort(arr1);
        boolean isEquals = Arrays.equals(arr1,arr2);
        assertTrue(isEquals);
    }

    @Test
    public void testSortedArraysCase() {
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{1,2,3};

        sorting.sort(arr1);
        boolean isEquals = Arrays.equals(arr1,arr2);
        assertTrue(isEquals);
    }

    @Test
    public void testOtherCases() {

        int[] arr1 = new int[]{3,2,1};
        int[] arr2 = new int[]{1,2,3};

        sorting.sort(arr1);
        boolean isEquals = Arrays.equals(arr1,arr2);
        assertTrue(isEquals);
    }

}