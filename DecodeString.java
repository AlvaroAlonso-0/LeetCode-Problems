/*
 * Given an encoded string, return its decoded string.
 * 
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square 
 * brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * 
 * You may assume that the input string is always valid; there are no extra white spaces, square 
 * brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain 
 * any digits and that digits are only for those repeat numbers, k. For example, there will not be 
 * input like 3a or 2[4].
 */

class Solution{
    private int pos = 0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        int repeat = 0;
        while(pos <s.length()){
            char c = s.charAt(pos);
            if(c>='0' && c<='9'){
                repeat = repeat*10 + (c-'0');
            }else if(c=='['){
                pos++;
                String sub = decodeString(s);
                for(int i=0; i<repeat; i++){
                    sb.append(sub);
                }
                repeat = 0;
            }else if(c==']'){
                break;
            } else{
                sb.append(c);
            }
            pos++;
        }         
        return sb.toString(); 
    }
}