class Solution {
    public char kthCharacter(int k) {
        k--;
        int pow=1;
        while(pow<=k){
            pow=pow*2;
        }
        pow=pow/2;
        int jump=0;
        while(k>0){
            if(k-pow>=0){
                k=k-pow;
                jump++;
            }
            pow=pow/2;
        }
        return (char)('a'+jump);
            }
}