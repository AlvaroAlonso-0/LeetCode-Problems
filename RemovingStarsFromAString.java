/*
 * You are given a string s, which contains stars *.
 * 
 * In one operation, you can:
 *  Choose a star in s.
 *  Remove the closest non-star character to its left, as well as remove the star itself.
 *  Return the string after all stars have been removed.
 */

class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                if(sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}