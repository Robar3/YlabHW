package hw1;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        Test2 test2=new Test2();
        int[] x = {5,6,3,2,5,1,4,9};
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        test2.quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }

    public void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int midEl = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < midEl) {
                i++;
            }

            while (array[j] > midEl) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
