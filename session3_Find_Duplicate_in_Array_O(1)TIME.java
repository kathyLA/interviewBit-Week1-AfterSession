public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        HashMap <Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int n = a.size();
        for (int i = 0; i< n;  i++) {
            int key = a.get(i);
            if(hashmap.containsKey(key)) {
                hashmap.put(key,hashmap.get(key)+1);
            } else {
                hashmap.put(key,1);
            }
        }
        int result = -1;
        for(Integer key: hashmap.keySet()) {
            if(hashmap.get(key) > 1) {
                result = key;
                break;
            }
        }
        return result;
    }
}
