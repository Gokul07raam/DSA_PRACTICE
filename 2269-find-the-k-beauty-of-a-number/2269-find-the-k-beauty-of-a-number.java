class Solution {
    public int divisorSubstrings(int num, int k) {
        int counter=0;
        int temp=num;
        while(temp >=(int) Math.pow(10,k-1)){
            int a= temp %  (int) Math.pow(10,k);
            if(a!=0){
            if(num%a == 0){
                counter++;
            }
            }
            temp/=10;
        }
        return counter;
    }
}