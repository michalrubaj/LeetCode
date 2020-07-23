package pl.michalrubaj.leetcode.arrays.second;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] input = {1,5,2,0,6,8,0,6,0};
        duplicateZeros(input);
        System.out.println(Arrays.toString(input));
    }

    public static void duplicateZeros(int[] input) {
        int left = 0, right = input.length - 2;
        while(right >= left) {
           if(input[left] == 0) {
               for (int i = right; i >= left; i--) {
                   input[i + 1] = input[i];
               }
               left++;
           }
           left++;
        }
    }

}
