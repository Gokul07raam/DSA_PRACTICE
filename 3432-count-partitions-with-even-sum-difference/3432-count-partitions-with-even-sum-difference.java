class Solution {
    public int countPartitions(int[] nums) {
        int res=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
        }
        if(ans%2 == 0){
            return nums.length-1;
        }
        return 0;
    } 
}