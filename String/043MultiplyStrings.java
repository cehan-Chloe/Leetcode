public class Solution {
    public String multiply(String num1, String num2) {
        if (num1 == null ||  num2 == null ){
            return null;
        }
        if (num1.length() == 0 || num2.length() == 0){
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res = new int [len1 + len2];
        char[] array1 = num1.toCharArray(), array2 = num2.toCharArray();
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                // consider carry, so ues i + j + 1 instead of i + j 
                res[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }
        int carry = 0;
        for (int i = len1 + len2 - 1; i >= 0; i --){
            res[i] = res[i] + carry;
            carry = res[i] / 10;
            res[i] %= 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : res) {
            sb.append(num);
        }
        while (sb.length() != 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        // forgot the situation that "0" * "0" = "00" then all of the "0"s are removed
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
