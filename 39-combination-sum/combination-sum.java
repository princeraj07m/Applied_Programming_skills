class Solution {
    void f(int []arr,int n, int i,int sum, int target ,List<List<Integer>> ans, List<Integer> curr ){
        if(sum > target) return;
        if(i>=n){
            if(sum==target){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        //take
        curr.add(arr[i]);
        f(arr,arr.length,i,sum+arr[i],target,ans,curr);
        //not take
        curr.remove(curr.size()-1);
        f(arr,arr.length,i+1,sum,target,ans,curr);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        f(candidates, candidates.length, 0, 0,target,ans,curr);
        return ans;
    }
}