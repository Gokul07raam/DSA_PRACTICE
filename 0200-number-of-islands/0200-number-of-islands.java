class Solution {
    void dfs(char[][] grid,int curr_row,int curr_col){
        int m=grid.length;
        int n=grid[0].length;
        if(curr_row>=m || curr_col>=n || curr_row<0 || curr_col<0 || grid[curr_row][curr_col]=='0') {
            return;
        }
        grid[curr_row][curr_col]='0';
        dfs(grid,curr_row+1,curr_col);
        dfs(grid,curr_row-1,curr_col);
        dfs(grid,curr_row,curr_col+1);
        dfs(grid,curr_row,curr_col-1);
         }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int counter=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    counter++;
                    dfs(grid,i,j);
                }
            }
                    
            }
            return counter;
    }
}