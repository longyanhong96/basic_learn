package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/1 9:44 上午
 */
public class SortedSquaresSolution {
    public int[] sortedSquares(int[] nums) {
        int[] ints = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        int insertIndex = nums.length - 1;

        while (insertIndex >= 0) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ints[insertIndex] = nums[left] * nums[left];
                left++;
            } else {
                ints[insertIndex] = nums[right] * nums[right];
                right--;
            }
            insertIndex--;
        }

        return ints;
    }
}
