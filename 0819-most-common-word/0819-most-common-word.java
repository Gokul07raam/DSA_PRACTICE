class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str=paragraph.toLowerCase();
        String [] words=str.split("[^a-z]+");
             HashMap<String,Integer>map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word:banned){
            map.remove(word);
        }
        int max=0;
        String ans="";
        for(String res:map.keySet()){
              if(map.get(res)>max){
                max=map.get(res);
               ans=res;
              }

              }
              return ans;
        }
     
    }
