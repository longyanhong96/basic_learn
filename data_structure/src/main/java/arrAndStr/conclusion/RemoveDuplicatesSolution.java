package arrAndStr.conclusion;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/2 3:15 下午
 */
public class RemoveDuplicatesSolution {
    public static int removeDuplicates(int[] nums) {

        int fast = 1;
        int slow = 1;

        for (; fast < nums.length; fast++) {
            if (nums[fast - 1] != nums[fast]) {
                if (slow != fast) {
                    nums[slow] = nums[fast];
                }
                slow++;
            }
        }

        return slow;
    }
}
