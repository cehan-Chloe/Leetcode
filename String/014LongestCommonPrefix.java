public class Solution {
    public String compareTwoString(String prefix, String cur){
        int j;
        for (j = 0; j < Math.min(prefix.length(),cur.length()); j ++){
            System.out.println("j is " + j);
            if (prefix.charAt(j) != cur.charAt(j)){
                break;
            }
        }
        prefix = prefix.substring(0, j);
        return prefix;
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i ++){
            prefix = compareTwoString(prefix,strs[i]);
            
        }
        return prefix;
    }
}
