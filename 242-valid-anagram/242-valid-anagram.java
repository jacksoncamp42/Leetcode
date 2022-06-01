class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.equals(t)) return true;
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, (oldValue, n) -> oldValue + 1);
            tMap.merge(t.charAt(i), 1, (oldValue, n) -> oldValue + 1);
        }
        
        for(Character key : sMap.keySet()) {
            if(!sMap.get(key).equals(tMap.get(key))) return false;
        }
        return true;
    }
}