class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int startWindow = 0;
        int endWindow = 0;
        int longest = 0;
        int n = s.length();
        HashSet<Character> window = new HashSet<>();
        
        while (endWindow < n) {
            if (!window.contains(s.charAt(endWindow))) {
                window.add(s.charAt(endWindow));
                endWindow++;
            } else {
                window.remove(s.charAt(startWindow));
                startWindow++;
            }
            longest = Math.max(longest, endWindow - startWindow);
        }

        return longest;
    
    }
}