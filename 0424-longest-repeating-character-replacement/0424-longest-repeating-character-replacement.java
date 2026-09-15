class Solution {
    public int characterReplacement(String s, int k) {
        int [] freq=new int[26];
        int i,j;
        i=j=0;
        int max_f=0;
        int max_size=0;
        for(j=0;j<s.length();j++){
            int index=s.charAt(j)-'A';
            freq[index]++;
            max_f=Math.max(max_f,freq[index]);
        
        while((j-i+1)-max_f > k){
            freq[s.charAt(i) - 'A']--;
            i++;
        }
max_size=Math.max(max_size,j-i+1);
 }
 return max_size;
    }
}