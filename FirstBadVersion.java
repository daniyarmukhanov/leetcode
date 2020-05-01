public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
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


    private static boolean isBadVersion(int n) {
        return n >= 4;
    }
}
