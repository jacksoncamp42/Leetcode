class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] result = new int[arr.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        
        int rank = 1;
        for(int i = 0; i < copy.length; i++) {
            if(!map.containsKey(copy[i])) {
                map.put(copy[i], rank);
                rank++;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]);
        }
        
        return result;
    }
}