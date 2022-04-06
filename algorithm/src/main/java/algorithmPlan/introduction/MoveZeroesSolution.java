package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description: 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意，必须在不复制数组的情况下原地对数组进行操作。
 * <p>
 * 示例 1:
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 示例 2:
 * <p>
 * 输入: nums = [0]
 * 输出: [0]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * @analysis:
 * @date 2022/4/2 10:08 上午
 */
public class MoveZeroesSolution {
    public static void moveZeroes(int[] nums) {
        int zero = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }

            while (nums[zero] != 0 && zero < i) {
                zero++;
            }

            if (i > zero) {
                int tmp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = tmp;
            }
        }
    }
}
