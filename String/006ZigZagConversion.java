public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (len <= numRows || numRows == 1) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        
        int size = 2 * numRows - 2;  
        for(int i = 0; i < numRows; i ++){  
            for(int j = i; j < s.length(); j += size){  
                sb.append(s.charAt(j));  
                if(i != 0 && i != (numRows - 1)){//except the first row and the last row
                    int temp = j + size - 2*i;
                    if(temp < s.length()){
                        sb.append(s.charAt(temp));
                    }
                }
            }                  
        } 
        return sb.toString(); 
    }
}
