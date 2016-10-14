public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()){
            return 0;
        }
        int lenS = s.length();
        int count = 0;
        int i = lenS - 1;
        while (s.charAt(i) == ' '){
            i --;
            if (i < 0){
                return 0;
            }
        }
        while(i >= 0){
            if (s.charAt(i) == ' ' ){
                return count;
            }
            count ++;
            i --;
        }
        return count;
    }
}
