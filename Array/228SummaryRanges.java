public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length==1){
            res.add(nums[0] + "");
            return res;
        }
        for(int i=0;i < nums.length;i++){
            int a = nums[i];
            while(i + 1 < nums.length && (nums[i+1] == nums[i] + 1)){
                i++;
            }
            if(a!=nums[i]){
                res.add(a + "->" + nums[i]);
            }else{
                res.add(String.valueOf(a));
            }
        }
        return res;
    }
}