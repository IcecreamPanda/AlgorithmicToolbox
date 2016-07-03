import java.util.*;


public class FractionalKnapsack {

    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;

        double[][] arrayComp = new double[values.length][2];
        for (int i = 0; i < arrayComp.length; i++) {
            arrayComp[i][0] = (double)values[i] / weights[i];
            arrayComp[i][1] = i;
        }

        Arrays.sort(arrayComp, (o1, o2) -> Double.compare(o2[0], o1[0]));

        for (int i = 0; i < arrayComp.length; i++){
            if (capacity == 0) {
                break;
            }
            if (capacity <= weights[(int)arrayComp[i][1]]) {
                value += arrayComp[i][0] * capacity;
                break;
            }

            value += values[(int)arrayComp[i][1]];
            capacity -= weights[(int)arrayComp[i][1]];

        }

        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(String.format("%.4f", getOptimalValue(capacity, values, weights)));
    }
} 
