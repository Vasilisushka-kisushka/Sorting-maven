package epam.rd;

import java.util.Arrays;

public class Sorting {
    public void sort(int[] array) {
        if (array==null){throw new IllegalArgumentException();}
        if (array.length<2){
          return;
        }
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int temp = array[i];
            if (array[i] > array[i + 1]) {
                array[i] = array[i + 1];
                array[i + 1] = temp;
                count++;
            }
        }
        if (count != 0) {
            sort(array);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[args.length];
        int counter = 0;
        for (String arg : args) {
            if (counter>args.length){return;}
            arr[counter]=Integer.parseInt(arg);
            counter ++;
        }
        Sorting sorting = new Sorting();
        sorting.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
