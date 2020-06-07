package june2020;

import java.util.*;

public class Contest192 {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(i, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                list.add(i, nums[n]);
                n++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public int[] getStrongest(int[] arr, int k) {
        arr = Arrays.stream(arr).
                boxed().
                sorted(Comparator.reverseOrder()).
                mapToInt(i -> i).
                toArray();
        int m = arr[(arr.length) / 2];
        arr = Arrays.stream(arr).
                boxed().
                sorted((a, b) -> {
                            Integer o1 = Math.abs(a - m);
                            Integer o2 = Math.abs(b - m);
                            return o2.compareTo(o1);
                        }
                ).
                mapToInt(i -> i).
                toArray();
        int[] kArr = new int[k];

        for (int i = 0; i < k; i++) {
            kArr[i] = arr[i];
        }
        return kArr;
    }
}
