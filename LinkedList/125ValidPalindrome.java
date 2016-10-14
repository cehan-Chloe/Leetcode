public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        int len = s.length();
        if (len < 2 || s.isEmpty()) return true;
        s = s.toLowerCase();
        int i = 0;
        int j = len - 1;
        while (i <= j){
            if (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(j))){
                j --;
            }
            else {
                if (s.charAt(i) != s.charAt(j)){
                return false;
                }
                else{
                    i++;
                    j--;
                }
            }
        }
        return true;
    }
}
