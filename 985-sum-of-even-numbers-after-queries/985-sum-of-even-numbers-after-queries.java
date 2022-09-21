class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] answer = new int[nums.length];
        int evenSum = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                evenSum += nums[i];
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            int vali = queries[i][0];
            int indexi = queries[i][1];
            
            if(nums[indexi] % 2 == 0) {
                evenSum -= nums[indexi];
            }
            
            nums[indexi] = nums[indexi] + vali;
            
            if(nums[indexi] % 2 == 0) {
                evenSum += nums[indexi];
            }
            
            answer[i] = evenSum;
        }
        
        return answer;
    }
}