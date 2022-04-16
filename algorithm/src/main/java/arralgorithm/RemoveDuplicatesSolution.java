package arralgorithm;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/14 3:12 下午
 */
public class RemoveDuplicatesSolution {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = slow + 1;
        for (; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                if (fast - slow > 2) {
                    nums[slow + 2] = nums[fast];
                }
                slow = fast;
            }
        }
        return slow + 1;
    }
}
