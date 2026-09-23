class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int n=tokens.length;
        for(int i=0;i<n;i++){
            if(tokens[i].charAt(0) == '+' && tokens[i].length()==1){
                int f_pop=stack.pop();
                int s_pop=stack.pop();
                int res=f_pop+s_pop;
    
                stack.push(res);
            }
            else if(tokens[i].charAt(0) == '-' && tokens[i].length()==1){
                int f_pop=stack.pop();
                int s_pop=stack.pop();
                int res=s_pop-f_pop;
                stack.push(res);
            }
            else if(tokens[i].charAt(0) == '*'){
                int f_pop=stack.pop();
                int s_pop=stack.pop();
                int res=s_pop*f_pop;
                stack.push(res);
            }
             else if(tokens[i].charAt(0) == '/'){
                int f_pop=stack.pop();
                int s_pop=stack.pop();
                int res=s_pop/f_pop;
                stack.push(res);
            }
            else{
            int nums=Integer.parseInt(tokens[i]);
            stack.push(nums);
            }
        }
        return stack.pop();
    }
}