class Solution {
    int dfs(int[][] grid, int curr_row, int curr_col, boolean[][] vis) {
        int counter = 1;

        int m = grid.length;
        int n = grid[0].length;

        if (curr_row >= m || curr_col >= n ||
            curr_row < 0 || curr_col < 0 ||
            grid[curr_row][curr_col] == 0 ||
            vis[curr_row][curr_col]) {
            return 0;
        }

        vis[curr_row][curr_col] = true;

        int[][] dr = {{0,1}, {1,0}, {0,-1}, {-1,0}};

        for (int i = 0; i < 4; i++) {
            int row = curr_row + dr[i][0];
            int col = curr_col + dr[i][1];

            if (row >= 0 && col >= 0 && row < m && col < n &&
                grid[row][col] == 1) {

                counter += dfs(grid, row, col, vis);
            }
        }

        return counter;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int maxx = 0;

        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1 && !vis[i][j]) {
                    maxx = Math.max(maxx, dfs(grid, i, j, vis));
                }
            }
        }

        return maxx;
    }
}