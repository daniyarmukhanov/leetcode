import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));

        int total = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2) {
                total += costs[i][0];
            } else
                total += costs[i][1];
        }

        return total;
    }

}
