package pl.michalrubaj.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] unsortedArray  = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));

    }

    public static void insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i = firstUnsortedIndex;
            while(i > 0 && array[i-1] > newElement) {
                array[i] = array[i-1];
                i--;
            }
            array[i] = newElement;
        }
    }

}
