class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int idx=row*col;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=1;i<=idx;i++){
            map.put(i,0);
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int key=grid[i][j];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }
        int []ans=new int[2];
        for(int key:map.keySet()){
            if(map.get(key)==2){
                ans[0]=key;
                
            }
            else if(map.get(key)==0){
                ans[1]=key;
            }
        }
        return ans;
    }
}