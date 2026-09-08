class Solution {
    public char kthCharacter(int k) {
        String curr="a";
    
        while(curr.length()<k){
             String temp="";
            for(int idx=0;idx<curr.length();idx++){
                char ch=curr.charAt(idx);
                if(ch>'z'){
                    ch='a';
                }
                ch=(char)(ch+1);
                temp=temp+ch;
              

            }
              curr=curr+temp;
        }
        return curr.charAt(k-1);
    }
}