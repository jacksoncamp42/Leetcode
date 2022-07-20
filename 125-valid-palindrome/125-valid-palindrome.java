class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while(left < right) {     
            while(!Character.isLetterOrDigit(s.charAt(left))) {
                if(left >= right) {
                    return true;
                }
                left++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right))) {
                if(left >= right) {
                    return true;
                }
                right--;
            }   
              
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}