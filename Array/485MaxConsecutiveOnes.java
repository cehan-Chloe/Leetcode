public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0){
            return 0;
        }
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == 1){
                count ++;
            }else {
                if (count > max){
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max){
            max = count;
        }
        return max;
    }
}
