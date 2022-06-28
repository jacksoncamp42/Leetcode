class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        
        for (char c: s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.add(c);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                if(map.get(c) != stack.pop()) {
                    return false;
                }
            }
        }     
        return stack.isEmpty();
    }
}