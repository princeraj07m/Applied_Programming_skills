class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i =0;i<=n;i++){
            int count =0;
            int idx = i;
            while(idx>0){
                if(idx%2!=0){
                    count++;
                    idx=idx/2;
                }else{
                    idx = idx/2;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}