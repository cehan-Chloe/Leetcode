public class Solution {
    public boolean isValid(String s) {
        if (s == null || (s.length() % 2) != 0){
            return false;
        }
        if (s.isEmpty()){
            return true;
        }
        Stack stk = new Stack();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '['){
                stk.push(arr[i]);
            }
            else {
                if (stk.empty()){
                    return false;
                }
                char top = (char)stk.pop();
                if ((top == '(' && arr[i] != ')') || (top == '[' && arr[i] != ']') || (top == '{' && arr[i] != '}')){
                    return false;
                }
            }
        }
        if (stk.empty()){
            return true;
        }
        return false;
    }
}
