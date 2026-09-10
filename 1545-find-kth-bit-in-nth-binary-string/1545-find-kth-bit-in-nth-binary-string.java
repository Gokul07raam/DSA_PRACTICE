class Solution {
    public char findKthBit(int n, int k) {
        int copyk=k,count=0,flag=0,sq=0,idx=0;
        while((2<<idx)<copyk){
            sq=2<<idx;
            idx++;
            }
            if((2<<idx)==k){
                return '1';
            }
    
    while(copyk!=1){
        if(sq<copyk){
            int temp=copyk-sq;
            copyk=sq-temp;
            count++;
        
        }
        sq/=2;
        if(sq==copyk && copyk!=1){
            flag=1;
            break;
        }
    }
        if(flag==1){
            if(count%2==0){
                return'1';            }
        
        else{
            return '0';
        }
    }
    if(count%2==0){
        return '0';
    }
    return '1';
    }
    }
