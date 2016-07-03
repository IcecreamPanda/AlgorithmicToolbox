import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        if (n == 0) {
            return 0;
        }
        int[] buffer = new int[n + 1];

        buffer[0] = 0;
        buffer[1] = 1;
        if (n > 1) {
            for (int i = 2; i < n + 1; i++) {
                buffer[i] = (buffer[i - 1] + buffer[i - 2]) % 10;
            }
        }
        return buffer[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigit(n);
        System.out.println(c);
    }
}

