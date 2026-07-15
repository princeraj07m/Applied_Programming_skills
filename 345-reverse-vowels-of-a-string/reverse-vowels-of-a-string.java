class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb  = new StringBuilder(s);
        int j = sb.length()-1;
        HashSet<Character> mp = new HashSet<>();
        mp.add('a');mp.add('e');mp.add('i');mp.add('o');mp.add('u');
        mp.add('A');mp.add('E');mp.add('I');mp.add('O');mp.add('U');
        for(int i =0;i<sb.length() && j >=0;){
            if(i>=j)break;
            while(i<sb.length() && !mp.contains(sb.charAt(i)))i++;
            while(j>=0 && !mp.contains(sb.charAt(j)))j--;
            if(i>=j)break;
            Character temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return sb.toString();

    }
}