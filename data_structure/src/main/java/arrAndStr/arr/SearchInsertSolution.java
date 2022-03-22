package arrAndStr.arr;

/**
 * @author longyh
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/cxqdh/
 * @analysis:
 * @date 2022/3/22 2:06 下午
 */
public class SearchInsertSolution {
    public static int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int midNum = nums[mid];

            if (midNum == target) {
                return mid;
            }

            if (target > midNum) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}
