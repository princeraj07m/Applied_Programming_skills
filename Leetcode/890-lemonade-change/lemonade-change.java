class Solution {
    public boolean lemonadeChange(int[] bills) {
     
        int five = 0,ten = 0;
        for(var num : bills){
            if(num == 5){
                five++;
            }else if(num == 10){
                if(five<1){
                    return false;
                }
                five--;
                ten++;
            }else if(num == 20){
                if(ten > 0 && five >0){
                    ten--;
                    five--;
                }else if(five>2){
                    five = five - 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}