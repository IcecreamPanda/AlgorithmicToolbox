import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(int[] numbers) {
        long currentMaxResult = 0;
        long currentMax = numbers[0];
        long previousMax = 0;

        int n = numbers.length;

        for (int i = 1; i < n; ++i) {
            if (numbers[i] > currentMax) {
                previousMax = currentMax;
                currentMax = numbers[i];
                currentMaxResult = currentMax * previousMax;
            }else if(numbers[i]> previousMax){
                previousMax = numbers[i];
                currentMaxResult = currentMax * previousMax;
            }
        }
        return currentMaxResult;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}