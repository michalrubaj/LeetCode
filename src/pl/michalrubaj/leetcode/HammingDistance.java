package pl.michalrubaj.leetcode;

public class HammingDistance {


    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
    public static int hammingDistance(int x, int y) {
        return  (int) Integer.toBinaryString(x ^ y)
                .chars()
                .mapToObj(i -> i - 48)
                .filter(i -> i == 1)
                .count();

    }
}
