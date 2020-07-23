package pl.michalrubaj.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray  = {20, -15, 7, 35, 1, -22, 55};
        bubbleSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void bubbleSort(int[] arrayToSort) {
        for (int j = arrayToSort.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    swap(arrayToSort, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j) {

        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
