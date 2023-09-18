/*
 * You are given two strings word1 and word2. Merge the strings by adding letters 
 * in alternating order, starting with word1. If a string is longer than the other,
 *  append the additional letters onto the end of the merged string.
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(i=0; i<word1.length() || i<word2.length(); i++){
            if(i<word1.length())
                sb.append(word1.charAt(i));
            if(i<word2.length())
                sb.append(word2.charAt(i));
        }
        if(i<word1.length())
            sb.append(word1.substring(i));
        else if(i<word2.length())
            sb.append(word2.substring(i));
            
        return sb.toString();
    }
}