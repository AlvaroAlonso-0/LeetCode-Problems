/*
 * Given a binary array nums, you should delete one element from it.
 * 
 * Return the size of the longest non-empty subarray containing 
 * only 1's in the resulting array. Return 0 if there is no such subarray.
 */

class Solution{
    public int longestSubarray(int[] nums){
        int start = 0;
        int end = 0;
        int zero = 0;
        int max = 0;
        while(end < nums.length){
            if(nums[end]==0)
                zero++;
            while(zero > 1){
                if(nums[start]==0)
                    zero--;
                start++;
            }
            max = Math.max(max, end-start+1-zero);
            end++;
        }

        return (max == nums.length) ? max-1 : max;
    }
}