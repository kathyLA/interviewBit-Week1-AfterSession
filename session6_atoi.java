public class Solution {
    public int atoi(final String a) {
        
        // trim white spaces
        String s = new String(a.trim());
        
        
        StringBuffer b = new StringBuffer();
        for (int i = 0; i< s.length(); i++) {
            if ("01234567890+-".indexOf(a.charAt(i)) == -1) {
                break;
            } else {
                b = b.append(a.charAt(i));
            }
        }
        s = b.toString();
        
        if (s.length() < 1)
            return 0;
        
        char flag = '+';
        
        int i = 0;
        if (s.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }
        // int and double
        double result = 0;
        while (s.length() > i) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        
        if (flag == '-')
            result = -result;
        
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int) result;
    }
}
