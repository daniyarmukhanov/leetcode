package june2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueReconstructionbyHeight {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> (b[0] == a[0] ? a[1] - b[1] : b[0] - a[0]));
        List<int[]> sorted = new ArrayList<>();
        for (int[] person : people) {
            sorted.add(person[1], person);
        }
        return sorted.toArray(new int[0][0]);
    }
}
