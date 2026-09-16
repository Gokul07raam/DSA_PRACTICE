class Solution {
    public boolean check_same(int [] a,int [] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
              if(s1.length() > s2.length()){
            return false;
        }
        int [] freq1=new int[26];
        int [] freq2=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int per=s1.length();
        for(int i=0;i<per;i++){
            freq2[s2.charAt(i)-'a']++;
        }
        if(check_same(freq1,freq2)){
            return true;
        }
        for(int i=per;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-per)-'a']--;
            if(check_same(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
}