class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left_occurence=-1;
        int  st=0;
        int end=nums.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target){
                left_occurence= mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        int right_occurence=-1;
          st=0;
         end=nums.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target){
                right_occurence= mid;
                st=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
               st=mid+1;
            }
        }
return new int[]{left_occurence,right_occurence};
    }
}