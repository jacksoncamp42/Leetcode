class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        
        Arrays.sort(nums);
        // for(int i : nums) {
        //     System.out.println(i);
        // }
        int consecutive = 1;
        int maxConsecutive = 1;
        int i = 0;
        
        for(int j = 1; j < nums.length; j++) {
            if((nums[i] + 1) == nums[j]) {
                consecutive++;
            }
            else if (nums[i] != nums[j]){
                consecutive = 1;
            }
            maxConsecutive = Math.max(maxConsecutive, consecutive);
            i++;
        }
        
        return maxConsecutive;
    }
}