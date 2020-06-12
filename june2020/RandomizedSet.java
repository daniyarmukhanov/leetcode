import java.util.HashSet;
import java.util.Set;

public class RandomizedSet {
    Set<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int i) {
        return set.add(i);
    }

    public boolean remove(int i) {
        return set.remove(i);
    }

    public int getRandom() {
        int random = (int) (set.size() * Math.random());
        int count = 0;
        for (int i : set) {
            if (count == random) {
                return i;
            }
            count++;
        }
        return 0;
    }
}
