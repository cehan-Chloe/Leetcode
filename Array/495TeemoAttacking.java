public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = 0;
        int time = 0;
        for (int i = 0; i < timeSeries.length; i ++){
            int cur = timeSeries[i];
            if (cur >= time){
                // no overlap
                res += duration;
            }
            else {
                res += cur + duration - time;
            }
            time = cur + duration;
        }
        return res;
    }
}
