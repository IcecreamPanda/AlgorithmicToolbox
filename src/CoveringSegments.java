import java.util.*;

public class CoveringSegments {

    private static List<Integer> optimalPoints(Segment[] segments) {

        Arrays.sort(segments, (o1, o2) -> o1.end - o2.end);

        List<Integer> points = new ArrayList<>();
        points.add(segments[0].end);
        for (int i = 0; i <= segments.length; ) {

            Segment point = segments[i];

            int spot = 0;

            for (int j = i; j < segments.length; j++) {
                Segment t = segments[j];
                spot = j;

                if (point.end < t.start) {
                    points.add(t.end);
                    break;
                }
            }

            i = spot;

            if (i == segments.length - 1) {
                break;
            }

        }

        return points;
    }

    private static class Segment {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        List<Integer> points = optimalPoints(segments);
        System.out.println(points.size());
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 
