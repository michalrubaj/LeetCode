package pl.michalrubaj.leetcode.arrays.first;

import java.util.stream.IntStream;

public class EvenDigits {

    public static void main(String[] args) {
        int[] array = {1000};
        System.out.println(findNumbers(array));
    }

    public static int findNumbers(int[] nums) {
        int counter = 0;
        for(int i : nums) {
            if(length(i) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }


    public static int length(int n) {
        if(n >= 10000) {
            if(n == 100000) {
                return 6;
            }
            return 5;
        } else {
            if (n >= 1000) {
                return 4;
            }
            if (n >= 100) {
                return 3;
            }
            if(n >= 10) {
                return 2;
            } else {
                return 1;
            }
        }
    }


    public static int findNumbersStream(int[] nums) {
        return (int) IntStream.of(nums)
                .mapToObj(Integer::toString)
                .filter(x -> x.length() % 2 == 0)
                .count();
    }

}
