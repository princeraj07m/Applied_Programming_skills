class Solution {
    public List<Integer> getRow(int rowIndex) {
       List <Integer> ans = new ArrayList<>();
        for(int i =0;i<=rowIndex;i++){
            long item =1;
            List <Integer> set = new ArrayList<>();
            for(int j =0;j<=i;j++){
                set.add((int)item);
                item = item * (i-j)/(j+1);
            }
            ans = set;
        }
        return ans;
    }
}