public class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim().replaceAll(" +", "");
        // use stack to help handling the priority of operator
        int num = 0;
        char sign = '+';
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < s.length(); i ++){
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
            }
            // ignored i == (s.length() - 1). after the last num, need to judge the current sign and do the calculation
            if((!Character.isDigit(s.charAt(i)) || i == (s.length() - 1))) {
                if (sign == '+'){
                    st.push(num);
                }
                if (sign == '-'){
                    st.push(-num);
                }
                if (sign == '*'){
                    st.push(st.pop() * num);
                }
                if (sign == '/'){
                    st.push(st.pop() / num);
                }
                sign = s.charAt(i);
                // at first ignored num = 0
                num = 0;
            }
            
        }
        int res = 0;
        for(int i:st){
            System.out.println("in st: " + i);
            res += i;
        }
        return res;
    }
}
