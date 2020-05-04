public class NumberComplement {
    public int findComplement(int num) {
        if (num == 0) return 1;
        int log2 = (int) (Math.log(num) / Math.log(2));
        int max = (int) Math.pow(2, log2 + 1);
        return max == Integer.MAX_VALUE ? max - num : max - num - 1;
    }
}
