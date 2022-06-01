class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        Map<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        char popped;
        
        for(char a : s.toCharArray()) {
            // (, [, {
            if(map.containsValue(a)) {
                stack.push(a);
            }
            // ), ], }
            else if(map.containsKey(a)) {
                if(stack.isEmpty()) {
                    return false;
                }
                //Need to check that last open paranthesis matches the closed one
                else {
                    if(stack.pop() != map.get(a)) {
                        return false;
                    }
                }
            }
        }
        if(!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}