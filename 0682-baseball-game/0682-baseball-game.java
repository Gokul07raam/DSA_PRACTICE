class Solution {
    public int calPoints(String[] s) {
        int n=s.length;
        Stack<Integer>stack=new Stack <>();
        for(int i=0;i<n;i++){
            if(s[i].charAt(0) == 'D'){
                int mul=stack.peek() * 2;
                stack.push(mul);
            }
           else if(s[i].charAt(0) == 'C'){
                 stack.pop();
            }
            else if(s[i].charAt(0)=='+'){
                int second=stack.pop();
                int first=stack.pop();
                int third=first+second;
                stack.push(first);
                stack.push(second);
                stack.push(third);
            }
            else{
                int num=Integer.parseInt(s[i]);
                stack.push(num);
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}