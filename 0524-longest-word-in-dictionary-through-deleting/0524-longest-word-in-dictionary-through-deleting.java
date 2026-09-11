import java.util.*;
class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        int string_len=0;
        int dict_len=0;
        String res="";
        for(int idx=0;idx<dictionary.size();idx++){
            string_len=0;
            dict_len=0;
            while(string_len<s.length() && dictionary.get(idx).length()>dict_len){
                if(s.charAt(string_len)==(dictionary.get(idx)).charAt(dict_len)){
                   
                    dict_len++;
                }
                string_len++;
            }
            if(dict_len==dictionary.get(idx).length()){
                if(res.length()<dictionary.get(idx).length()){
                    res=dictionary.get(idx);
                }
                else if(res.length()==dictionary.get(idx).length()){
                    if( res.compareTo(dictionary.get(idx))<0){
                        res=res;
                    }
                    else if( res.compareTo(dictionary.get(idx))>0){
                        res=dictionary.get(idx);
                    }
                    else{
                        res=res;
                    }
                }
            }
    
            }
        return res;
    }
}