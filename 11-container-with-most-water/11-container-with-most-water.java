class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxVolume = Integer.MIN_VALUE;
        
        
        while(left < right) {
            int leftWall = height[left];
            int rightWall = height[right];
            int lowWall = Math.min(leftWall, rightWall);
            int currentVolume = lowWall * (right - left);
            maxVolume = Math.max(maxVolume, currentVolume);
            
            //shift left
            if(leftWall < rightWall) {
                left++;
            }
            //shift right
            else {
                right--;
            }
            
        }
        return maxVolume;
    }
}