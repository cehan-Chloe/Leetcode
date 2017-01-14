public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> majorMap = new HashMap<>();
        //Hashtable<Integer, Integer> majorMap = new Hashtable<Integer, Integer>();
        int res = 0;
        for (int num : nums) {
            if (!majorMap.containsKey(num)){
                majorMap.put(num, 1);
            }
            else {
                majorMap.put(num, majorMap.get(num) + 1);
            }
            if (majorMap.get(num) > nums.length/2) {
                res = num;
                break;
            }
        }
        return res;
    }
}
