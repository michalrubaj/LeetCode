package pl.michalrubaj.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] unsortedArray  = {20, 35, -15, 7, 55, -22, 1};
        selectionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }

    public static void selectionSort(int[] array) {

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            int indexOfLargestValue = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[indexOfLargestValue]) {
                    indexOfLargestValue = i;
                }
            }
            swap(array, indexOfLargestValue ,lastUnsortedIndex);
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
