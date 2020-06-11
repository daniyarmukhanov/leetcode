public class SortColors {
    public void sortColors(int[] nums) {
        int[] count = {0, 0};
        for (int num : nums) {
            if (num == 0)
                count[0]++;
            if (num == 1)
                count[1]++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (count[0] > 0) {
                nums[i] = 0;
                count[0]--;
            } else if (count[1] > 0) {
                nums[i] = 1;
                count[1]--;
            } else {
                nums[i] = 2;
            }
        }
    }
}
