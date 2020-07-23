package pl.michalrubaj.leetcode.arrays.first;

import java.util.Arrays;

public class SquareSort {

    public static void main(String[] args) {
        int[] input = {-3,-1,4,5};
        System.out.println(Arrays.toString(sortedSquares(input)));
    }

    public static int[] sortedSquares(int[] A) {
        int l = 0, r = A.length -1;
        int[] result = new int[A.length];
        while(r >= l) {
           int left = Math.abs(A[l]), right = Math.abs(A[r]);
           if (left > right) {
               result[r - l] = left * left;
               l++;
           } else {
               result[r - l] = right * right;
               r--;
           }
        }
        return result;
    }
}
