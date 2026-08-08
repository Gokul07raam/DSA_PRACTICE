class Solution {
public:
    vector<int> validSequence(string word1, string word2) {
        int n=word1.size();
        int m=word2.size();
        int i=n-1;
        int j=m-1;
        vector<int>prev(m,-1);
        vector<int>ans(m);
        while(i>=0 && j>=0){
            if(word1[i]==word2[j]){
                prev[j]=i;
                j--;
            }
            i--;
        }
        bool skipped=true;
        j=0;
        for(int i=0;i<n && j<m;i++){
            if(word1[i]==word2[j]){
                ans[j]=i;
                j++;
            }
            else if(skipped && (j==m-1 || prev[j+1]>i)){
                ans[j]=i;
                j++;
                skipped=false;
            }
        }
        if(j!=m){
            return {};
        }
        return ans;
           }
};