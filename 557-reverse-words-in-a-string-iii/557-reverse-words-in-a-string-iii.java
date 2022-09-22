class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        String result = "";
        while(end < s.length()) {
            if(s.charAt(end) == ' ') {
                result += reverse(s.substring(start, end)) + " ";
                start = end + 1;
            }
            end++;
        }
        
        return result + reverse(s.substring(start, end));
    }
    
    public String reverse(String s) {
        String res = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}