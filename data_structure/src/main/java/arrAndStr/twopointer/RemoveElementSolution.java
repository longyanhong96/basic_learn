package arrAndStr.twopointer;

/**
 * @author longyh
 * @Description:
 * @analysis: nums = [0,1,2,2,3,0,4,2], val = 2
 * @date 2022/3/28 10:00 上午
 */
public class RemoveElementSolution {
    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (i != slow) {
                    int tmp = nums[i];
                    nums[i] = nums[slow];
                    nums[slow] = tmp;
                }
                slow++;
            }
        }
        return slow;
    }
}

/**
 * int slow = 0;
 * int fast = 0;
 * <p>
 * while (slow < nums.length && fast < nums.length) {
 * while (slow < nums.length && nums[slow] != val) {
 * slow++;
 * }
 * <p>
 * fast = slow;
 * <p>
 * while (fast < nums.length && nums[fast] == val) {
 * fast++;
 * }
 * <p>
 * if (slow < nums.length && fast < nums.length) {
 * int tmp = nums[slow];
 * nums[slow] = nums[fast];
 * nums[fast] = tmp;
 * }
 * }
 * <p>
 * return slow;
 */
