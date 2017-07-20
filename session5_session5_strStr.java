public class Solution {
    public int strStr(final String haystack, final String needle) {
        
        if(needle.length() == 0 || haystack.length() == 0)
            return 0;
        
        for(int i=0; i<haystack.length(); i++){
            if(i + needle.length() > haystack.length())
                return -1;
            
            int k = i;
            for(int j=0; j<needle.length(); j++){
                if(needle.charAt(j)==haystack.charAt(k)){
                    if(j==needle.length()-1)
                        return i;
                    k++;
                }else{
                    break;
                }
                
            }    
        }
        return -1;
    }
}
