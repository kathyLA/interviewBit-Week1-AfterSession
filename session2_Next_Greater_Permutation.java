public class Solution {
    //how to find the next greater permuataion
    //if there is no next permutation could be find, doing the reverse
    public void nextPermutation(ArrayList<Integer> a) {
        int n = a.size();
        if(n >1) {
            int index = -1;
            for (int i= n-1; i >0 ; i--) {
                if(a.get(i) > a.get(i-1)) {
                    index = i-1;
                    break;
                }
            }
            
            if(index == -1) {
                Collections.reverse(a);
            } else {
                //
                int comp = a.get(index);
                int j = 0;
                int min = Integer.MAX_VALUE;
                
                for(int i = n-1; i> index; i--){
                    if (a.get(i)> comp) {
                        if(a.get(i) < min) {
                            min = a.get(i);
                            j = i;
                        }
                    }
                }
                int temp = a.get(j);
                a.set(j,comp);
                a.set(index,temp);
                //
                Collections.sort(a.subList(index+1,n));   
            }  
        }
    }     
}
