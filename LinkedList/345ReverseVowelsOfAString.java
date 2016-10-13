public class Solution {
    
    private boolean isVowel(char n){
        return (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U');
    }
    
    public String reverseVowels(String s) {
        char[] sArr = s.toCharArray();
        char[] arr = new char[s.length()];
        int k = 0;
        for (int i = 0; i < s.length(); i++){
            if (isVowel(sArr[i])){
                arr[k] = sArr[i];
                k ++;
            } 
        }
        for (int j = 0; j < s.length(); j++){
            if (isVowel(sArr[j])){
                k --;
                sArr[j] = arr[k];
            }
        }
        return String.valueOf(sArr);
    }
}
