class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int zero_count=0;
        int max_size=0;
        while(j<nums.length){
                if(nums[j]==0){
                    zero_count++;
            }
            while(zero_count > k){
            if(nums[i]==0){
                zero_count-=1;
                
            }
            i++;
            }
max_size=Math.max(max_size,j-i+1);
j++;
        }
        return max_size;
    }
}