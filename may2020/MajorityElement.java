public class MajorityElement {
    public int majorityElement(int[] nums) {
        int voteCount = 0;
        int candidate = nums[0];
        for (int number : nums) {
            if (voteCount == 0)
                candidate = number;
            if (number == candidate) voteCount++;
            else voteCount--;
        }
        return candidate;
    }
}
