class Solution {
    boolean isPal(String s , int i, int j){
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    void f(String s, int idx, List<String> curr, List<List<String>> ans) {
        if(idx >= s.length()){
            ans.add(new ArrayList(curr));
            return;
        }

        for(int i = idx;i<s.length();i++){
            if(isPal(s,idx,i)){
                curr.add(s.substring(idx,i+1));
                f(s,i+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        f(s, 0, new ArrayList<>(), ans);
        return ans;
    }
}