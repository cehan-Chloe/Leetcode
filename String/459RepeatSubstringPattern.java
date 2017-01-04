public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        // for String, use length() to get length and for array use size() to get length
        int len = str.length();
        for (int i = len / 2; i >= 1; i --){
            if (len % i == 0){
                int repeat = len / i;
                // the use of substring is get the string from 0 to repeat - 1
                String subStr = str.substring(0, i);
                StringBuilder tmpStr = new StringBuilder();
                for (int j = 0; j < repeat; j ++){
                    tmpStr.append(subStr);
                }
                // toString() not toString
                // return tmpStr.toString().equals(str);
                // should not return result directly if they are not equal
                if (tmpStr.toString().equals(str)){
                    return true;
                }
            }
        }
        // at first the location of return false is wrong
        return false;
        
        
    }
}
