class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        
        for(int[] i : intervals) {
            queue.add(i);
        }
        List<int[]> result = new LinkedList<int[]>();
        while(!queue.isEmpty()) {
            int[] interval = queue.poll();
            while(!queue.isEmpty() && interval[1] >= queue.peek()[0]) {
                int[] merged = queue.poll();
                interval[0] = Math.min(interval[0], merged[0]);
                interval[1] = Math.max(interval[1], merged[1]); 
            }  
            result.add(interval);
        }
            
        return result.toArray(new int[result.size()][]);
    }
}