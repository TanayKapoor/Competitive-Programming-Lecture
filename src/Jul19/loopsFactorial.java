package Jul19;

public class loopsFactorial {
    public static void main(String[] args) {
        int n = 5;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
