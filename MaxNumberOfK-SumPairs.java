/*
 * You are given an integer array nums and an integer k.
 * 
 * In one operation, you can pick two numbers from the array whose sum equals 
 * k and remove them from the array. 
 * 
 * Return the maximum number of operations you can perform on the array.
 */

import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int left = 0, right = nums.length - 1;
        Arrays.sort(nums);

        while(left < right) {
            if(nums[left] + nums[right] == k) {
                count++;
                left++;
                right--;
            } else if(nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}