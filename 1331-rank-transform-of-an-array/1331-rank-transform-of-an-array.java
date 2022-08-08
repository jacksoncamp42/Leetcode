class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        
        //HashMap Key: Element Value: Rank
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: sorted) {
            if(!map.containsKey(i)) {
                map.put(i, map.size() + 1);
            }
        }
        
        int[] result = new int[arr.length];
        for(int j = 0; j < arr.length; j++) {
            result[j] = map.get(arr[j]);
        }
        
        return result;
    }
}