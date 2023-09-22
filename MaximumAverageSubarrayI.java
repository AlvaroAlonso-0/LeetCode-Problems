/*
 * You are given an integer array nums consisting of n elements, and an integer k.
 * 
 * Find a contiguous subarray whose length is equal to k that has the maximum 
 * average value and return this value. Any answer with a calculation error 
 * less than 10-5 will be accepted.
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int avg = 0;
        for(int i = 0; i < k; i++) {
            avg += nums[i];
        }
        int maxAvg = avg;
        for(int i=k; i<nums.length;i++){
            avg += nums[i] - nums[i-k];
            maxAvg = Math.max(maxAvg, avg);
        }
        return (double)maxAvg/k;
    }
}