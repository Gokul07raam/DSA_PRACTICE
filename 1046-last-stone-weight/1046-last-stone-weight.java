class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int n=stones.length;
        for(int i=0;i<n;i++){
            q.add(stones[i]);
        }
        int max1,max2;
        while(q.size()>1){
            max1=q.poll();
            max2=q.poll();
            if(max1 != max2){
                q.add(max1-max2);
            }
            
        }
        if(q.size()==0) return 0;
        
        else return q.poll();
    }
}