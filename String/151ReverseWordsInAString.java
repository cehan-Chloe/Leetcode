public class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0){
            return s;
        }
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i = 0; i<= words.length - 1; i++){
            if(!words[i].isEmpty()) {
                res.insert(0, words[i]);
                if(i < (words.length - 1)) res.insert(0, " ");
            }
        }
        return res.toString();
    }
}
