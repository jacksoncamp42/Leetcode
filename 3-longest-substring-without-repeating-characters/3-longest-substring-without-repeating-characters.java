class Solution {
    public int lengthOfLongestSubstring(String s) {
        int startWindow = 0;
        int endWindow = 0;
        int longest = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        
        while(endWindow < s.length()) {
            char c = s.charAt(endWindow);
            
            if(map.containsKey(c)) {
                startWindow = map.get(c) + 1;
                endWindow = startWindow;
                map = new HashMap<>();
            }
            else {
                map.put(c, endWindow);
                longest = Math.max(longest, endWindow - startWindow + 1);
                endWindow++;
            }
        }
        return longest;
    }
}