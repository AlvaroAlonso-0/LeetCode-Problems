/*
 * Given an array of integers arr, return true if 
 * the number of occurrences of each value in the 
 * array is unique or false otherwise.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution{
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int n: arr) {
            if(map.containsKey(n))
                map.put(n, map.get(n) + 1);
            else
                map.put(n, 1);
        }
        
        for(int n: map.values()) {
            if(set.contains(n))
                return false;
            else
                set.add(n);
        }
        return true;
    }
}