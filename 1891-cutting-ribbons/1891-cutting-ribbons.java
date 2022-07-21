class Solution {
    public int maxLength(int[] ribbons, int k) {

        int max_value = Integer.MIN_VALUE ;
        for(int i=0 ; i<ribbons.length ; i++){
            max_value = Math.max(max_value , ribbons[i]);
        }
        
        int start = 0 ;
        int end = max_value ;
        int max_length = 0 ;
        
        while(start <= end){
            int mid = start + (end-start)/2 ;
            if(isPossible(ribbons , mid , k)){
                max_length = mid ;
                start = mid+1 ;
            }else{
                end = mid-1 ;
            }
        }
        
        return max_length ;
    }
    
    public boolean isPossible(int[] ribbons , int length , int k){
        
        if(length == 0){
            return true ;
        }
        
        int count = 0 ;
        
        for(int i=0 ; i<ribbons.length ; i++){
            
            if(length <= ribbons[i]){
                count += ribbons[i]/length ;
            }
            
            if(count >= k){
                return true ;
            }
        }

        return false ;
    }
}