package arrAndStr.twoPointer;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/26 15:00
 */
public class ArrayPairSumSolution {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}
