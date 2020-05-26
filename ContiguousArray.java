import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> index = new HashMap<>();
        index.put(0, -1);
        int balance = 0, maxlen = 0;
        for (int i = 0; i < nums.length; i++) {
            balance += nums[i] * 2 - 1;
            Integer first = index.putIfAbsent(balance, i);
            if (first != null)
                maxlen = Math.max(maxlen, i - first);
        }
        return maxlen;
    }
}
