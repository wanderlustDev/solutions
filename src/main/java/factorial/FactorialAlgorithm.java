package factorial;

public class FactorialAlgorithm {

    public long factorial(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
