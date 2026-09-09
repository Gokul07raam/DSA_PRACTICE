class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int key=nums[i];
            if(map.containsKey(key)==false){
                map.put(key,1);
            }
            else{
                map.put(key,map.get(key)+1);
            }
        }
        int ans=0;
        for(int keys: map.keySet()){
            if(map.containsKey(keys+1)==true){
                int res=map.get(keys)+map.get(keys+1);
                if(res>ans){
                    ans=res;
                }
            }
        }
        return ans;
    }
}