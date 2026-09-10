class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int [] ans=new int[n];
        int left=-n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                left=i;
            }
            ans[i]=i-left;
        }
        int right=n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c){
                right=i;
            }
            if(right<n){
            ans[i]=Math.min(ans[i],right-i);
            }
        }
        return ans;
    }
}