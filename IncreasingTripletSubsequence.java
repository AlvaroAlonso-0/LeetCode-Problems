/*
 * Given an integer array nums, return true if there exists 
 * a triple of indices (i, j, k) such that i < j < k and nums[i] 
 * < nums[j] < nums[k]. If no such indices exists, return false.
 */

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<=min){
                min = nums[i];
            }
            else if(nums[i]<middle){
                middle = nums[i];
            }
            else if(nums[i]>middle){
                return true;
            }
        }
        return false;
    }
}