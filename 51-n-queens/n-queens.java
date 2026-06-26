class Solution {
    boolean isSafe(int row, int col, char[][]board,int n){
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row-1,j = col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row-1,j = col+1;i>=0&&j<n;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    void f(int row,int n,char [][]board,List<List<String>>ans){
        //base case
        if(row == n){
            List<String> temp = new ArrayList<>();
            for(int i =0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        //logic 
        int i = row;
        for(int j =0;j<n;j++){
            if(isSafe(i,j,board,n)){
                board[i][j]='Q';
                f(row+1,n,board,ans);
                board[i][j]= '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char [][]board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        f(0,n,board,ans);
        return ans;
    }
}