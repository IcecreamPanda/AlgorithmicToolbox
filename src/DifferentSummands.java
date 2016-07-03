import java.util.*;

public class DifferentSummands {
    private static List<Integer> optimalSummands(int n) {

        List<Integer> summands = new ArrayList<>();

        int a = n;
        int b = 1;

        while (a > 0) {
            if (a <= 2 * b) {
                summands.add(a);
                a -= a;
            } else {
                summands.add(b);
                a -= b;
                b += 1;
            }
        }

        return summands;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> summands = optimalSummands(n);
        System.out.println(summands.size());
        for (Integer summand : summands) {
            System.out.print(summand + " ");
        }
    }
}

