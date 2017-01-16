public class Solution {
    public List<Integer> getRow(int rowIndex) {
        // first method is not O(k) space
        
        // List<List<Integer>> res = new ArrayList<>();
        // if (rowIndex < 0){
        //     return new ArrayList<>();
        // }
        // for (int i = 0; i <= rowIndex; i ++){
        //     List<Integer> l = new ArrayList<>();
        //     for(int j = 0; j < i + 1; j ++){
        //         if (j == 0 || j == i){
        //             l.add(1);
        //         } else {
        //             l.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
        //         }
        //     }
        //     res.add(l);
        // }
        // return res.get(rowIndex);
        
        // top solution
        List<Integer> list = new ArrayList<Integer>();
    	if (rowIndex < 0)
    		return list;
    
    	for (int i = 0; i < rowIndex + 1; i++) {
    		list.add(0, 1);
    		for (int j = 1; j < list.size() - 1; j++) {
    			list.set(j, list.get(j) + list.get(j + 1));
    		}
    	}
    	return list;
    }
}
