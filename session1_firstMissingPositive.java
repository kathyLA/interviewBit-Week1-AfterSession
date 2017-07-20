public class Solution {
    public int firstMissingPositive(ArrayList<Integer> a) {
        int n = a.size();
        int[] A = new int[n];
        for(int i = 0; i < n; i++)
            if(a.get(i)>0 && a.get(i)<= n)
                A[a.get(i)-1] = a.get(i);
        for(int i = 0; i < n; i++)
            if(A[i] != i+1)
                return i+1;
        return n+1;
    }
}
