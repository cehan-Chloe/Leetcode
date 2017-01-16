public class Solution {
    public int maxProduct(int[] nums) {
        // first method, time limit exceed
        // int prev;
        // int max = nums[0];
        // int i = 0;
        // while(i < nums.length){
        //     int j = i;
        //     prev = 1;
        //     while (j < nums.length){
        //         if (prev * nums[j] > max){
        //             max = prev * nums[j];
        //         }
        //         prev *= nums[j];
        //         j ++;
        //     }
        //     i ++;
        // }
        // return max;
       
	// DP, not very clear
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        
        min[0] = max[0] = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = max[i] = nums[i];
            if (nums[i] > 0) {
                max[i] = Math.max(max[i], max[i - 1] * nums[i]);
                min[i] = Math.min(min[i], min[i - 1] * nums[i]);
            } else if (nums[i] < 0) {
                max[i] = Math.max(max[i], min[i - 1] * nums[i]);
                min[i] = Math.min(min[i], max[i - 1] * nums[i]);
            }
            
            result = Math.max(result, max[i]);
        }
        
        return result;
    }
}


public class Solution {
  public int maxProduct(int[] A) {
    if (A == null || A.length == 0) {
        return 0;
    }
    int[] f = new int[A.length];
    int[] g = new int[A.length];
    f[0] = A[0];
    g[0] = A[0];
    int res = A[0];
    for (int i = 1; i < A.length; i++) {
        f[i] = Math.max(Math.max(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
        g[i] = Math.min(Math.min(f[i - 1] * A[i], g[i - 1] * A[i]), A[i]);
        res = Math.max(res, f[i]);
    }
    return res;
  }
}
