class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int maxRooms = 0;
        PriorityQueue<int[]> currentRooms = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        for(int i = 0; i < intervals.length; i++) {
            currentRooms.add(intervals[i]);
            while(currentRooms.peek()[1] <= intervals[i][0]) {
                currentRooms.poll();
            }
            maxRooms = Math.max(maxRooms, currentRooms.size());
        }
        
        return maxRooms;
    }
}