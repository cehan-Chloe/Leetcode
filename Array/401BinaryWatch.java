public class Solution {
    public List<String> readBinaryWatch(int num) {
        int[] hours = new int[]{8, 4, 2, 1};
        int[] minutes = new int[]{32, 16, 8, 4, 2, 1};
        List<String> res = new ArrayList<>();
        for (int hour = 0; hour <= num; hour ++){
            List<Integer> num1 = getNum(hours, hour);
            List<Integer> num2 = getNum(minutes, num - hour);
            for(int i: num1) {
                if(i >= 12) continue;
                for(int j: num2) {
                    if(j >= 60) continue;
                    res.add(i + ":" + (j < 10 ? "0" + j : j));
                }
            }
        }
        return res;
    }
    
    public List<Integer> getNum(int[] list, int count){
        List<Integer> ans = new ArrayList<>();
        backTracking(ans, list, count, 0, 0);
        return ans;
    }
    
    public void backTracking (List<Integer> ans, int[] list, int count, int start, int sum){
        if(count == 0) {
            ans.add(sum);
            return;
        }
        for (int i = start; i < list.length; i ++){
            backTracking (ans, list, count - 1, i + 1, sum + list[i]);
        }
    }
}
