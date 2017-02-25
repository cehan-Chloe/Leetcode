public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0; 
        int right = numbers.length - 1;
        while(left < right){
            if (numbers[left] + numbers[right] == target){
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
            else if(numbers[left] + numbers[right] < target){
                left ++;
            }
            else {
                right --;
            }
        }
        return res;
    }
}

// for binary search, top solution
for(int i=0; i<numbers.size()-1; i++) {
    int start=i+1, end=numbers.size()-1, gap=target-numbers[i];
    while(start <= end) {
        int m = start+(end-start)/2;
        if(numbers[m] == gap) return {i+1,m+1};
        else if(numbers[m] > gap) end=m-1;
        else start=m+1;
    }
}
