class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxx=new PriorityQueue<>();
        for(int num:nums){
            maxx.offer(num);
            if(maxx.size()>k){
                maxx.poll();
            }
        }
   return maxx.peek();
    }
}