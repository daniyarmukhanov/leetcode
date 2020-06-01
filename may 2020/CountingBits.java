public class CountingBits {
    public int[] countBits(int num) {
        int[] a = new int[num + 1];
        a[0] = 0;
        for (int i = 1; i < a.length; i++) {
            a[i] = a[i / 2] + i % 2;
        }
        return a;
    }


}
