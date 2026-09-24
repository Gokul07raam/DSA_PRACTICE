class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int zero_ctr=0;
        int one_ctr=0;
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> que= new LinkedList<>();
        for(int i=students.length-1;i>=0;i--){
            if(students[i]==0){
                zero_ctr++;
            }
            else{
                one_ctr++;
            }
      que.offer(students[i]);
        }
    int ind=0;
    int stu_ch;
    while(ind<sandwiches.length){
        if(sandwiches[ind]==0 && zero_ctr==0) break;
        if(sandwiches[ind]==1 && one_ctr==0) break;
        stu_ch=que.poll();
        if(stu_ch == sandwiches[ind]){
            ind++;
            if(stu_ch == 0) zero_ctr--;
            else one_ctr--;
        }
        else{
            que.offer(stu_ch);
        }
    }
    return sandwiches.length-ind;
    }
}