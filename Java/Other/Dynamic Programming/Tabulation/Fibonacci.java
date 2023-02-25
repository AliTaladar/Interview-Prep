
public class main {
    public static void main(String[] args) {
        System.out.println(fibonacci(46));
    }

    public static int fibonacci(int n){
        // not a classic tabulation implementation
        // because we're only storing the last two element for a more optimized space complexity
        int[] lastTwo = {0, 1};
        if(n == 0 || n == 1) return lastTwo[n];

        int count = 1;

        while(count != n){
            int nextNum = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextNum;
            count++;
        }

        return lastTwo[1];
    }

}