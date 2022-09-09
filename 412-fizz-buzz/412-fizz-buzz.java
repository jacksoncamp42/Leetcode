class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<String>();
        
        for(int i = 1; i <= n; i++) {
            String str = "";
            if(i % 3 == 0) {
                str += "Fizz";
                if(i % 5 == 0) {
                    str += "Buzz";
                }
            }
            else if(i % 5 == 0) {
                str += "Buzz";
            }
            else {
                str += i + "";
            }
            result.add(str);
        }
        
        return result;
    }
}