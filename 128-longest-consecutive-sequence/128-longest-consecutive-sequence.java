class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        
        Set<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int length = 0;
        int max = 0;
        
        for(int n : nums) {
            if(!numbers.contains(n-1)) {
                length = 1;
                while(numbers.contains(n + length)) {
                    length++;
                }
                max = Math.max(length, max);
            }
        }
        return max;
    }
}