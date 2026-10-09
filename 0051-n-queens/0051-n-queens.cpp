class Solution {
public:
vector<vector<string>>result;
vector<string>board;
vector<int>col,d1,d2;
int n;
void solve(int row){
    if(row==n){
        result.push_back(board);
        return;
    }

for(int i=0;i<n;i++){
    if(col[i]||d1[row+i]||d2[row-i+n-1])
      continue;
    board[row][i]='Q';
    col[i]=d1[row+i]=d2[row-i+n-1]=1;
    solve(row+1);
     board[row][i]='.';
    col[i]=d1[row+i]=d2[row-i+n-1]=0; 
}
}
    vector<vector<string>> solveNQueens(int n) {
        this->n=n;
        col=vector<int>(n,0);
        board=vector<string>(n,string(n,'.'));
        d1=vector<int>(2*n,0);
        d2=vector<int>(2*n,0);
        solve(0);
        return result;
    }
};