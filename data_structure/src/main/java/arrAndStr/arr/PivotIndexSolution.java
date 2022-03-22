package arrAndStr.arr;

import java.util.Arrays;

/**
 * @author longyh
 * @Description: 给你一个整数数组 nums ，请计算数组的 中心下标 。
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 * 事例见:
 * https://leetcode-cn.com/leetbook/read/array-and-string/yf47s/
 * @analysis:
 * @date 2022/3/22 9:56 上午
 */
public class PivotIndexSolution {
    /**
     * 统计总数，总数不断减，一个不断加，直到相等
     *
     * @param nums
     * @return index
     */
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int lengthSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            sum -= currentNum;
            rightSum = sum;
            if (i != 0) {
                int beforeNum = nums[i - 1];
                lengthSum += beforeNum;
            }

            if (lengthSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    /**
     * https://leetcode-cn.com/problems/find-pivot-index/solution/xun-zhao-shu-zu-de-zhong-xin-suo-yin-by-gzjle/
     * @param nums
     * @return
     */
    public int pivotIndexOfficial(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }


}
