class Solution {
    public int removeDuplicates(int[] nums) {
        int start=1;
        int search=1;
        while(search<nums.length){
            if(nums[search]!=nums[search-1]){
                nums[start++]=nums[search];
            }
            search++;
        }
        return start;
    }
}