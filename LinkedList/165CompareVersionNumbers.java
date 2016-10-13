public class Solution {
    public int compareVersion(String version1, String version2) {
        // the first method forget the situation that 1.0 == 1
        // String[] arrVersion1 = version1.split("\\.");
        // String[] arrVersion2 = version2.split("\\.");
        // int i = 0;
        // while(i < arrVersion1.length && i < arrVersion2.length){
        //     if (Integer.parseInt(arrVersion1[i]) > Integer.parseInt(arrVersion2[i])){
        //         return 1;
        //     }
        //     else if (Integer.parseInt(arrVersion1[i]) < Integer.parseInt(arrVersion2[i])){
        //         return -1;
        //     }
        //     else {
        //         i++;
        //     }
        // }
        // if (arrVersion1.length >= i){
        //     return 1;
        // }
        // if (arrVersion2.length >= i){
        //     return -1;
        // }
        // return 0;
        
        int len1 = version1.length();
        int len2 = version2.length();
        int num1 = 0;
        int num2 = 0;
        int i = 0;
        int j = 0;
        
        while(i < len1 || j < len2){
            while (i < len1 && version1.charAt(i) != '.'){
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i ++;
            }
            while (j < len2 && version2.charAt(j) != '.'){
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j ++;
            }
            if (num1 > num2) return 1;
            else if (num1 < num2) return -1;
            else{
                // to avoid the situation 1.0 and 1
                num1 = 0;
                num2 = 0;
                i ++;
                j ++;
            }
        }
        return 0;
    }
}
