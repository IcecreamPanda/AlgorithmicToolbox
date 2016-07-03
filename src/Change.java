import java.util.Scanner;

public class Change {

    private static int count = 0;

    private static int getChange(int n) {
        int currentChange = proceed(n);

        while (currentChange != 0) {
            currentChange = proceed(currentChange);
        }

        return count;
    }

    private static int proceed(int n) {

        if (n >= 10) {
            count += n / 10;
            return n % 10;
        } else if (n >= 5) {
            count += n / 5;
            return n % 5;
        } else {
            count += n;
            return 0;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getChange(n));

    }
}

