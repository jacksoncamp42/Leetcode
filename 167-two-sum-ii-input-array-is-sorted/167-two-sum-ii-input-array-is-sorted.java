class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];

        int left = 0;
        int right = numbers.length - 1;
        int t;
        
        while(left < right) {
            t = target - numbers[left];
            //keep decrementing right until it is equal to or less than target
            while(numbers[right] > t) {
                right--;
            }
            if(numbers[right] == t) {
                output[0] = left+1;
                output[1] = right+1;
                return output;
            }         
            left++;
        }  
        return null;
    }
}