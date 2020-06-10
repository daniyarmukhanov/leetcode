public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums[nums.length - 1] < target)
            return nums.length;
        if (nums[0] > target)
            return 0;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] > target) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return right;
    }
}
