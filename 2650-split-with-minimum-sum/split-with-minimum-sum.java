class Solution {
    public int splitNum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = num;
        while(temp>0){
            int rem = temp%10;
            list.add(rem);
            temp = temp/10;
        } 
        Collections.sort(list);
        int flag = 1;

        int n1 = 0;
        int n2 = 0;
        for(var i: list){
            if(flag ==1){
                n1*=10;
                n1+=i;
                flag=-1*flag;
            }else{
                n2*=10;
                n2+=i;
                flag = -1*flag;
            }
        }
        return n1+n2;
    }
}