class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> lis = new ArrayList<Integer>();
        int ind,val1,val2,abs_val1,abs_val2;
        Stack<Integer> stack  = new Stack<Integer> ();
        for(ind=0;ind<asteroids.length;ind++)
        {
            if(stack.isEmpty()==true)
            {
                 stack.push(asteroids[ind]);
            }
            else// if(stack.peek()>0&&asteroids[ind]<0)
            {
                abs_val1=Math.abs(stack.peek());
                abs_val2=Math.abs(asteroids[ind]);
                val1=stack.peek();
                val2=asteroids[ind];
                if(val1>0&&val2<0)
                {
                    if(abs_val1==abs_val2)
                    {
                      //  System.out.print("eq "+asteroids[ind]+"   ");
                        stack.pop();
                    }
                    else if(abs_val2>abs_val1)
                   {
                     while(stack.isEmpty()==false&&asteroids[ind]<0&&stack.peek()>0&&Math.abs(asteroids[ind])>Math.abs(stack.peek()))
                    {
                        stack.pop();
                    }
                    if(stack.isEmpty()==false&&asteroids[ind]<0&&stack.peek()>0&&Math.abs(asteroids[ind])==Math.abs(stack.peek()))
                    {
                        stack.pop();
                    }
                    // else if(stack.isEmpty()==false&&Math.abs(asteroids[ind])<Math.abs(stack.peek()))
                    // {}
                    else if(stack.isEmpty()==true)
                    {
                       // System.out.print("el if "+asteroids[ind]+"   ");
                        stack.push(asteroids[ind]);
                    }
                    else if((asteroids[ind]<0&&stack.peek()<0)||(asteroids[ind]>=0&&stack.peek()>=0))
                    {
                        //System.out.print("el if "+asteroids[ind]+"   ");
                        stack.push(asteroids[ind]);
                    }
                    

                   }
                }//-3 -4 5 6 -7
                else
                {
                    //System.out.print("el "+asteroids[ind]+"   ");
                    stack.push(asteroids[ind]);
                }
            }
        }
        
        int [] res= new int[stack.size()];
        ind=stack.size()-1;
        while(stack.isEmpty()==false)
        {
            res[ind--]=stack.pop();
        }
        return res;
    }
}
