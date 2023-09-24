/*
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * 
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * 
 * Note that the integers in the lists may be returned in any order.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n: nums1) {
            set1.add(n);
        }
        for(int n: nums2) {
            set2.add(n);
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int n: set1) {
            if(!set2.contains(n)) {
                list1.add(n);
            }
        }
        for(int n: set2) {
            if(!set1.contains(n)) {
                list2.add(n);
            }
        }

        answer.add(list1);
        answer.add(list2);
        return answer;
    }
}