class Solution {
    long mod=1000000007;
    long power(long a,long b){
        long result=1;
        while(b>0){
            if(b%2==1){
                result=(result*a)% mod;
            }
            a=(a*a)%mod;
            b/=2;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        return (int)(((power(5,even)) * (power(4,odd)))%mod);
    }
}