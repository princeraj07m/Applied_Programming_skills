class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
    int pos = 0;
        for(var ch : s.toCharArray()){
            mp.put(ch ,mp.getOrDefault(ch, 0) + 1);
            
        }
        for(var ch : s.toCharArray()){
            if(mp.get(ch) ==1 ){
                return pos;
            }
            pos++;
        }
        return -1;

    }
}