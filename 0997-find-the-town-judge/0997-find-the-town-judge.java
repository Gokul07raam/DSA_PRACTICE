class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] in_deg=new int[n+1];
        for(int i=0;i<trust.length;i++){
            int from=trust[i][0];
            int to=trust[i][1];
            in_deg[to]++;
            in_deg[from]--;
        }
        for(int i=1;i<=n;i++){
            if(in_deg[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}