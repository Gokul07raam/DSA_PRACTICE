class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int name_ptr=0;
        int typed_ptr=0;
        while( typed_ptr<typed.length()){
            if(name_ptr<name.length() && name.charAt(name_ptr)==typed.charAt(typed_ptr)){
                name_ptr++;
            }
            else if(typed_ptr==0 || typed.charAt(typed_ptr)!=typed.charAt(typed_ptr-1)){
                return false;
            }
            typed_ptr++;         
        }
        if(name.length()== name_ptr){
            return true;
        }
        return false;
    }
}