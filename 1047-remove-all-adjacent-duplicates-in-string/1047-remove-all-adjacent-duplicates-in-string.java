class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();
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
        ans.append(c);
    }
    return ans.toString();
}
}