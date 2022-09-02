class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int prevMax = Integer.MIN_VALUE;
            if(i >= 2) {
                for(int j = i-2; j >= 0; j--) {
                    prevMax = Math.max(prevMax, dp[j]);
                }
                current += prevMax;
            }
            dp[i] = current;
            max = Math.max(max, current);
        }
        return max;
        
    }
}