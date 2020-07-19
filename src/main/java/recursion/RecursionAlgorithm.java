package recursion;

public class RecursionAlgorithm {

    public long recursion(int n) {
        long y, x = 0;
        if (n > 0) {
            System.out.println(n);
            n--;
            y = recursion(n);
            x = recursion(n);
        } else {
            return 1;
        }
        return y;
    }
}
