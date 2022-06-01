class Solution {
    public int[] twoSum(int[] nums, int target) { 
        Map<Integer,Integer> map = new HashMap<>();
        int t;
        int[] x = new int[2];
        for(int i = 0; i < nums.length; i++) {
            t = target - nums[i];
            if (map.containsKey(t)) {
                x[0] = map.get(t);
                x[1] = i;
                return x;
            }
            map.put(nums[i],i);
        }
        return null;
    }  
}