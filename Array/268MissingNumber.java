public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < size; i ++){
            sum += nums[i];
        }
        return (1 + size) * size / 2 - sum;
    }
}
