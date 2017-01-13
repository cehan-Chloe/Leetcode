public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // top solution: negate
        for (int i = 0; i < nums.length; i ++){
            int index = nums[i];
            if ((nums[Math.abs(index) - 1]) > 0){
                nums[Math.abs(index) - 1] = - nums[Math.abs(index) - 1];
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < nums.length; j ++){
            if (nums[j] > 0){
                res.add(j + 1);
            }
        }
        return res;
    }
}
