class Solution {
    static int image_dia(int [][]img,int i,int j){
        int m=img.length;
        int n=img[0].length;
        int []dr={-1,-1,-1,0,0,1,1,1};
        int []dc={-1,0,1,-1,1,-1,0,1};
        int sum=img[i][j];
        int ctr=1;
        for(int k=0;k<8;k++){
            int rows=i+dr[k];
            int cols=j+dc[k];
            if(rows>=0 && cols>=0 && rows<m && cols<n){
                sum+=img[rows][cols];
                ctr++;
            }
        }
        return Math.floorDiv(sum,ctr);
        }
    public int[][] imageSmoother(int[][] img) {
        int m=img.length;
        int n=img[0].length;
        int [][]res=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int ans=image_dia(img,i,j);
                res[i][j]=ans;
            }
        }
        return res;
    }
}