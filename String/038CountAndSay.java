public class Solution {
    public String countAndSay(int n) {
        if (n < 0){
            return null;
        }
        String prev = "1";
        while (n > 1){
            char[] arr = prev.toCharArray();
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < arr.length; i ++){
                int count = 1;
                while((i + 1) < arr.length && arr[i] == arr[i+1]){
                    count ++;
                    i ++;
                }
                sb.append(String.valueOf(count) + String.valueOf(arr[i]));
            }
            prev = sb.toString();
            n --;
        }
        return prev;
    }
}
