public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        int len = s.length();
        // for each item, the maximum length is 3
        for (int i = 1; i < (len - 2) && i < 4; i ++){
            for (int j = i + 1; j < (len - 1) && j < (i + 4); j ++){
                for (int m = j + 1; m < len && m < (j + 4); m ++){
                    String s1 = s.substring(0,i), s2 = s.substring(i,j), s3 = s.substring(j,m), s4 = s.substring(m,len);
                    // System.out.println("s1:" + s1);
                    // System.out.println("s2:" + s2);
                    // System.out.println("s3:" + s3);
                    // System.out.println("s4:" + s4);
                    if (isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)){
                        res.add(s1 + '.' + s2 + '.' + s3 + '.' + s4);
                    }
                }
            }
        }
        return res;
    }
    
    public boolean isValid(String s){
        // at first, ignored the standard that s.charAt(0) should be with length > 1
        if (s.length() > 3 || s.length() == 0 || Integer.parseInt(s) > 255 || (s.charAt(0) == '0' && s.length() > 1)){
            return false;
        }
        return true;
    }
}
