package arrAndStr.twopointer;

/**
 * @author longyh
 * @Description:
 * @analysis: nums = [0,1,2,2,3,0,4,2], val = 2
 * @date 2022/3/28 10:00 上午
 */
// todo 有点low,需要改
public class RemoveElementSolution {
    public static int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;

        while (slow < nums.length && fast < nums.length) {
            while (slow < nums.length && nums[slow] != val) {
                slow++;
            }

            fast = slow;

            while (fast < nums.length && nums[fast] == val) {
                fast++;
            }

            if (slow < nums.length && fast < nums.length) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
            }
        }

        return slow;
    }
}
