public class Solution {
    public int countSegments(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        // trim() to remove the leading spaces and trailing spaces
        s = s.trim(); 
        // at first ignored the situation that the string is contructed with several spaces
        if (s.length() == 0){
            return 0;
        }
        return s.split("\\s+").length;
        
    }
}
