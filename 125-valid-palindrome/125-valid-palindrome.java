class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            while(left < right && !(isAlphanum(s.charAt(left)))) {
                left++;
            }
            while(right > left && !(isAlphanum(s.charAt(right)))) {
                right--;
            }
            if(Character.toLowerCase(s.charAt(right)) != Character.toLowerCase(s.charAt(left))) {
               return false; 
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static boolean isAlphanum(char a) {
        if((a <= 'z' && a >= 'a') || (a <= 'Z' && a >= 'A') || (Character.isDigit(a))) {
            return true;
        }
        else {
            return false;
        }
    }
}