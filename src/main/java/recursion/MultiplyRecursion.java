package recursion;

public class MultiplyRecursion {
    int result = 0;
    public int multiply(int n, int m) {
        if (m > 0) {
            result = n + multiply(n, m - 1);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
