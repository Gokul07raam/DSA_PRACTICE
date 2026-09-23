class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        for(int a:arr){
            boolean valid=true;
            while(valid && !stack.isEmpty() && stack.peek()>0 && a<0){
                if(stack.peek() < -a){
                    stack.pop();
                }
                else if(stack.peek() == -a){
                    stack.pop();
                    valid=false;
                }
                else{
                    valid=false;
                }
            }
            if(valid){
                stack.push(a);
            }
        }
            int [] res=new  int[stack.size()];
            for(int i=0;i<stack.size();i++){
                res[i]=stack.get(i);
            }
        return res;
    }
}