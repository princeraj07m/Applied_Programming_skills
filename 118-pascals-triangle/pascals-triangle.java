class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
       
        for(int i =0;i<numRows;i++){
            int item =1;
            List <Integer> set = new ArrayList<>();
            for(int j =0;j<=i;j++){
                set.add(item);
                item = item * (i-j)/(j+1);
            }
            ans.add(set);
        }
        return ans;
    }
}