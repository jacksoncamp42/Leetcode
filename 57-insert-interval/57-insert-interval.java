class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new LinkedList<int[]>();
        int i = 0;
        
        //intervals before newInterval
        while(i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        
        int[] mergedInterval = new int[]{newInterval[0], newInterval[1]};
        //intervals merged /w newInterval
        while(i < intervals.length && intervals[i][0] <= newInterval[1]) {
            mergedInterval[0] = Math.min(mergedInterval[0], intervals[i][0]);
            mergedInterval[1] = Math.max(mergedInterval[1], intervals[i][1]);
            i++;
        }
        result.add(mergedInterval);
        
        //intervals after newInterval
        while(i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        
        return result.toArray(new int[result.size()][]);
    }
}