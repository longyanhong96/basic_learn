package arrAndStr.conclusion;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/3 1:28 下午
 */

// todo:low
public class FindMinSolution {
    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums[start] < nums[end]) {
            return nums[start];
        }

        while (start < end) {
            int mid = (start + end) / 2;

            if (nums[mid] >= nums[start] && nums[mid] > nums[end]) {
                start = mid + 1;
            }

            if (nums[mid] < nums[end]) {
                end = mid;
            }
        }

        return nums[start];
    }
}
