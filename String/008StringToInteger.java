public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()){
            return 0;
        }
        // remove spaces
        str = str.trim();
        if (str.length() == 0){
            return 0;
        }
        // check the num is positive or negetive
        int sign = 1;
        int index = 0;
        if (str.charAt(index) == '+'){
            index ++;
        }
        else if (str.charAt(index) == '-'){
            sign = -1;
            index ++;
        }
        long num = 0;
        while (index < str.length()){
            if (str.charAt(index) < '0' || str.charAt(index) > '9'){
                break;
            }
            num = num * 10 + (str.charAt(index) - '0');
            if (num > Integer.MAX_VALUE ) {
                break;
            }
            index ++;
        }
        if (sign * num >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if (sign * num <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) num * sign;
    }
}
