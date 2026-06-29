class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(var s:patterns){
            if(word.contains(s))count++;
        }
        return count;
    }
}