public class Solution {
    public String addBinary(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        int lenA = a.length();
        int lenB = b.length();
        char[] arrSum = new char[Math.max(lenA, lenB) + 1];
        int indexSum = arrSum.length - 1;
        int carry = 0;
        
        for (int indexA = lenA - 1, indexB = lenB - 1; indexA >= 0 || indexB >= 0; indexA--, indexB --) {
            int numA = indexA < 0 ? 0 : (arrA[indexA] - '0');
            int numB = indexB < 0 ? 0 : (arrB[indexB] - '0');
            int sum = numA + numB + carry;
            arrSum[indexSum] = (char)(sum % 2 + '0');
            carry = sum / 2;
            indexSum --;
        }
        arrSum[0] = (char)(carry + '0');
        if (carry == 0){
            return new String(arrSum, 1, arrSum.length - 1);
        }
        return String.valueOf(arrSum);
    }
}
