/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    public NestedInteger deserialize(String s) {
        // iterate
        if (s.isEmpty()){
            return new NestedInteger();
        }
        // the element is a number not a list
        if (s.charAt(0) != '['){
            return new NestedInteger(Integer.valueOf(s));
        }
        // the element is empty
        if (s.length() <= 2){
            return new NestedInteger();
        }
        int len = s.length();
        // use stack
        Stack<NestedInteger> stack = new Stack<>();
        StringBuilder num = new StringBuilder();
        
        for (int i = 0; i < len; i++) {
            switch (s.charAt(i)) {
                case '[':
                    stack.push(new NestedInteger());
                    break;
                    
                case ',':
                    // judge if it's a num before ','
                    if (num.length() != 0) {
                        // peek() to check the top element of stack but not remove it
                        stack.peek().add(new NestedInteger(Integer.parseInt(num.toString())));
                        clearNum(num);
                    }
                    break;
                    
                case ']':
                    // judge if it's a num before ']'
                    if (num.length() != 0) {
                        stack.peek().add(new NestedInteger(Integer.parseInt(num.toString())));
                        clearNum(num);
                    }
                    NestedInteger ni = stack.pop();
                    
                    if (!stack.isEmpty()) {
                        stack.peek().add(ni);
                    } else {
                        return ni;
                    }
                    break;
                    
                default:
                    num.append(s.charAt(i));
                    break;
            }
        }
        
        return null;
    }
    
    public void clearNum(StringBuilder sb) {
        sb.delete(0, sb.length());
    }
}
