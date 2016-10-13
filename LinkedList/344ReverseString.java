public class Solution {
    public String reverseString(String s) {
        // the first method time limit exceed
        // char[] sArr = s.toCharArray();
        // String newString = "";
        // for (int m = s.length() - 1; m >= 0; m --){
        //     newString += sArr[m];
        // }
        // return newString;
        
        // the second method also time limit exceed.
        // String newString = "";
        // for (int m = s.length() - 1; m >= 0; m --){
        //     newString += s.charAt(m);
        // } 
        // return newString;
        
        // StringBuilder stringToReturn = new StringBuilder();
        // for (int i = 0; i < s.length(); i++){
        //     stringToReturn.append(s.charAt(s.length()-i-1));
        // }
        // return String.valueOf(stringToReturn);
         
        return new StringBuilder(s).reverse().toString();
    }
}
