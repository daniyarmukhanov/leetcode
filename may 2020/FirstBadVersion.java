public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int right = n;
        int left = 1;
        int center;
        while (left < right) {
            center = (right - left) / 2 + left;
            if (isBadVersion(center)) right = center;
            else left = center + 1;
        }
        return left;
    }

    private boolean isBadVersion(int n) {
        return n >= 4;
    }
}
