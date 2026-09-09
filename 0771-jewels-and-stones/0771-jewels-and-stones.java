class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int idx=0;idx<jewels.length();idx++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(idx)==stones.charAt(j)){
                    ans++;
                }
            }
        }
        return ans;
    }
}