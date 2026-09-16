class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int st,end;
        st=1;
        end=0;
        for(int pile:piles){
            end=Math.max(end,pile);
}
int ans=end;
while(st<=end){
    int mid=(st+end)/2;
    long hours=0;
    for(int pile:piles){
        hours+=(pile+(long)mid-1)/mid;
    }
    if(hours<=h){
        ans=mid;
        end=mid-1;
    }
    else{
        st=mid+1;
    }
}
    
    return ans;
    }
}