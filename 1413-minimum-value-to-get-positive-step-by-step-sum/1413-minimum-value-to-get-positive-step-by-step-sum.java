class Solution {
    public int minStartValue(int[] nums) {
        int ans;
        int start=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            start+=nums[i];
            min=Math.min(min,start);
        }
        ans=1-min;
        return ans;
    }
}