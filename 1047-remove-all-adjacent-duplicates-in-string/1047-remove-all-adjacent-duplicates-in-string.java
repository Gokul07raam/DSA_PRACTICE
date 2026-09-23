class Solution {
    public String removeDuplicates(String s) {
        String ans=new String();
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() ==  c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
    }
    for(char c:stack){
        ans+=c;
    }
    return ans;
}
}