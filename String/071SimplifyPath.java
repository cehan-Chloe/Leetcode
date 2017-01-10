public class Solution {
    public String simplifyPath(String path) {
        if (path == null) {
            return null;
        }
        String[] array = path.trim().split("/");
        if (array.length == 0){
            return "/";
        }
        Stack st = new Stack();
        // at first split by / it would generate an empty line
        for (int i = 1; i < array.length; i ++){
            // at first, ignored the double slashes
            if (array[i].isEmpty()){
                continue;
            }
            if (array[i].equals(".")) {
                continue;
            }
            else if (array[i].equals("..")) {
                if (!st.empty()){
                    st.pop();
                }
                else {
                    continue;
                }
            }
            else {
                st.push(array[i]);
            }
        }
        
        StringBuilder res = new StringBuilder();
        if (st.empty()){
            return "/";
        }
        while (!st.empty()){
            String tmp = (String)st.pop();
            res.insert(0, tmp);
            res.insert(0, "/");
        }
        return res.toString();
    }
}
