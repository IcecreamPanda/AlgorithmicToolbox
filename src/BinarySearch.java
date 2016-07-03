import java.io.*;
import java.util.*;

public class BinarySearch {

    static int binarySearch(int[] a, int x) {
        int left = 0, right = a.length - 1;

        return bsImpl(a, left, right, x);
    }

    static int bsImpl(int[] a, int left, int right, int x) {
        if (right < left) {
            return left - 1;
        }
        int mid = left + ((right - left) / 2);
        if (x == a[mid]) {
            return mid;
        } else if (x < a[mid]) {
            if(mid==left){
                return -1;
            }
            return bsImpl(a, left, mid - 1, x);
        } else if ((x > a[mid])) {
            if(mid==right){
                return -1;
            }
            return bsImpl(a, mid + 1, right, x);
        }
        return -1;
    }


    //5 1 5 8 12 13
    //5 8 1 23 1 11
    static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a, b[i]) + " ");
        }
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
