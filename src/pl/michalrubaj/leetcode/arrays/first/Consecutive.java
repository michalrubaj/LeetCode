package pl.michalrubaj.leetcode.arrays.first;

public class Consecutive {

    public static void main(String[] args) {
        int[] array = {0,1,0,1,1,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(array));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i : nums){
            if(i == 0){
                max = Math.max(max,count);
                count = 0;
            } else {
                count++;
            }
        }
        return Math.max(max, count);
    }
}
