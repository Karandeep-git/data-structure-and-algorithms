
import java.util.HashSet;

public class GM06_P6LineReflection {
    public static boolean isReflected(int[][] points) {

        HashSet<String> pointSet = new HashSet<>();
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);

            pointSet.add(x + "#" + y);
        }

        int sum = minX + maxX;

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];

            String reflected = (sum - x) + "#" + y;

            if (!pointSet.contains(reflected)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isReflected(new int[][]{{1, 1},{-1, 1}}));
        System.out.println(isReflected(new int[][]{{1, 1},{-1, -1}}));
    }
}
