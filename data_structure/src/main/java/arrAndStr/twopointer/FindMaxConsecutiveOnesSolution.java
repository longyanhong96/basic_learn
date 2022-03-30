package arrAndStr.twopointer;

/**
 * @author longyh
 * @Description:
 * @analysis: nums = [1,1,0,1,1,1]
 * @date 2022/3/28 11:15 上午
 */
public class FindMaxConsecutiveOnesSolution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;

        int slow = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == 0) {
                maxLength = Math.max(i - slow, maxLength);
                slow = i + 1;
            }
        }

        maxLength = Math.max(i - slow, maxLength);
        return maxLength;
    }
}
