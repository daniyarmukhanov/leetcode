import java.util.*;

public class FindTownJudge {
    public int findJudge(int N, int[][] trust) {
        if (N == 1)
            return 1;
        if (trust.length < N - 1)
            return -1;

        Map<Integer, Integer> trusted = new HashMap<>();
        int count;
        int max = Integer.MIN_VALUE;
        int maxKey = 0;
        for (int[] trustItem : trust) {
            count = trusted.getOrDefault(trustItem[1], 0);
            count++;
            trusted.put(trustItem[1], count);
            if (count > max) {
                max = count;
                maxKey = trustItem[1];
            }
        }
        if (trusted.getOrDefault(maxKey, -1) < N - 1)
            return -1;
        for (int[] trustItem : trust) {
            if (trustItem[0] == maxKey)
                return -1;
        }


        return maxKey;
    }



}

/* better way from leetcode

    public int findJudge(int N, int[][] trust) {
        int[] count = new int[N];
        int[] trusted = new int[N];

        for (int i = 0; i < trust.length; i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            count[a - 1]++;
            trusted[b - 1]++;
        }

        for (int i = 0; i < N; i++) {
            if (count[i] == 0 && trusted[i] == N - 1) {
                return i + 1;
            }
        }
        return -1;
    }
*/
