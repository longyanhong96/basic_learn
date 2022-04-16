package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/12 9:44 上午
 */
public class RobSolution {
    public static int rob(int[] nums) {
        int[] sum = new int[nums.length];
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i - 2 < 0) {
                sum[i] = nums[i];
            } else if (i - 2 == 0) {
                sum[i] = nums[i] + sum[i - 2];
            } else {
                sum[i] = Math.max(sum[i - 2] + nums[i], sum[i - 3] + nums[i]);
            }
            max = Math.max(max, sum[i]);
        }

        return max;
    }
}
