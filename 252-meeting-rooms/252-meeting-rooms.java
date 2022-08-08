class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        if(intervals.length == 0 || intervals.length == 1) {
            return true;
        }
        int end = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < end) {
                return false;
            }
            end = intervals[i][1];
        }
        return true;
    }
}