public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
        int n = a.size();
        int index = -1;
        for(int i=0; i< n ; i++) {
            if (a.get(i)>0) {
                index = i ;
                break;
            }
        }
        
        List <Integer> b;
        if (index == -1) {
            b = a.subList(0,1);
            b.set(0,1);
        } else {
            b = a.subList(index,n);
            n = b.size();
            int left = 0;
            int init = b.get(n-1);
            
            b.set(n-1,init+1);
            for (int i= n -1 ; i >=0; i --){
                int sum = b.get(i) + left;
                if(sum < 10) {
                    b.set(i,sum);
                    left = 0;
                } else {
                    left = 1;
                    b.set(i, sum % 10);
                }
            }
            
            if (left > 0) {
                b.add(0,left);
            }    
        }
        
        return  new ArrayList(b);
    }
}
