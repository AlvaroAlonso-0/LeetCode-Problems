/*
 * Given a string s, reverse only all the vowels in the string and return it.
 * 
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower 
 * and upper cases, more than once.
 */

class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = word.length - 1;
        while(i<j){
            if(isVowel(word[i]) && isVowel(word[j])){
                swap(word, i, j);
                i++;
                j--;
            } else if(isVowel(word[i])){
                j--;
            } else if(isVowel(word[j])){
                i++;
            } else {
                i++;
                j--;
            }
        }
        return new String(word);
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private void swap(char[] word, int i, int j){
        char temp = word[i];
        word[i] = word[j];
        word[j] = temp;
    }
}