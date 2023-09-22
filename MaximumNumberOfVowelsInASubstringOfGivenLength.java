/*
 * Given a string s and an integer k, return the maximum number 
 * of vowel letters in any substring of s with length k.
 * 
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 */

class Solution{
    public int maxVowels(String s, int k){
        int maxVowels = 0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                maxVowels++;
            }
        }
        int currVowels = maxVowels;
        for(int i=k; i<s.length() && maxVowels<k; i++){
            if(isVowel(s.charAt(i))){
                currVowels++;
            }
            if(isVowel(s.charAt(i-k))){
                currVowels--;
            }
            maxVowels = Math.max(maxVowels, currVowels);
        }

        return maxVowels;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}