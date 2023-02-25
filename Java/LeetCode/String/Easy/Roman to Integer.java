class Solution {
    public int romanToInt(String s) {
        int val = 0, prev = 0, sum = 0;
        
        for(int i = 0; i< s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case 'I':
                    val = 1;
                    break;
                case 'V':
                    val = 5;
                    break;
                case 'X':
                    val = 10;
                    break;
                case 'L':
                    val = 50;
                    break;
                case 'C':
                    val = 100;
                    break;
                case 'D':
                    val = 500;
                    break;
                case 'M':
                    val = 1000;
                    break;
                
            }
        
        
            if (prev < val) {
                int num = val - prev * 2;
                sum += num;
            }else {
                sum += val;
            }
            prev = val;
        }
        return sum;
    }
}