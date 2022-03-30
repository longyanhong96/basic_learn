package arrAndStr.twopointer;

/**
 * @author longyh
 * @Description: 给定一个含有n个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组[numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/c0w4r/
 * @analysis:
 * @date 2022/3/28 2:33 下午
 */
public class MinSubArrayLenSolution {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int slow = 0;
        int i = 0;

        int minLength = nums.length;
        for (; i < nums.length; i++) {
            if (sum >= target) {
                minLength = Math.min(minLength, i - slow);
            }
            sum += nums[i];
            while (sum - nums[slow] >= target) {
                sum -= nums[slow];
                minLength = Math.min(minLength, i - slow);
                slow++;
            }
        }

        if (sum < target) {
            return 0;
        }
        return minLength;
    }
}
