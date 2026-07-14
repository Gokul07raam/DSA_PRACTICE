class Solution {
public:
    int trap(vector<int>& height) {
        int size=height.size();
        vector<int>leftH(size),rightH(size);
        int maxx=0;
        for(int i=0;i<size;i++){
            maxx=max(maxx,height[i]);
            leftH[i]=maxx;
        }
        maxx=0;
        for(int i=size-1;i>=0;i--){
            maxx=max(maxx,height[i]);
            rightH[i]=maxx;
        }
        int trapped=0;
        for(int i=0;i<size;i++){
            int small=min(leftH[i],rightH[i])-height[i];
            trapped+=small;
        }
        return trapped;
    }
};