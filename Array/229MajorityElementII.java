public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        if (nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        // at most 2 majority element
        // first hashmap method key-> num, value -> count
        // second sort the array, then check if the num is the same for nums[i] and nums[i + n/3], but sort is nlog(n)
        // top solution: boyer moore horspool algorithm
        
        List<Integer> res = new ArrayList<>();
        
        // 1. set two candidates and two counts
        int candidate1 = nums[0];
        int candidate2 = nums[0];
        int count1 = 0;
        int count2 = 0;
        
        // 2. first pass find the n candidate, this question is two
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == candidate1){
                count1 ++;
            }
            else if (nums[i] == candidate2){
                count2 ++;
            }
            else if (count1 == 0){
                candidate1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0){
                candidate2 = nums[i];
                count2 = 1;
            }
            else {
                count1 --;
                count2 --;
            }
        }
        count1 = 0;
        count2 = 0;
        
        
        System.out.println("candidate1: " + candidate1  +" candidate2: " + candidate2);
        // 3. second pass, check if the two candidates appear more than n / 3
        for (int j = 0; j < nums.length; j ++){
            if (nums[j] == candidate1){
                count1 ++;
            }
            if (nums[j] == candidate2){
                count2 ++;
            }
        }
        if (count1 > nums.length / 3){
            res.add(candidate1);
        }
        if (count2 > nums.length / 3 && candidate1 != candidate2){
            res.add(candidate2);
        }
        return res;
    }
}
