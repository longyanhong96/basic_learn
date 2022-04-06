package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description: 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @analysis:
 * @date 2022/3/31 2:35 下午
 */
public class SearchSolution {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            int midNum = nums[mid];
            if (midNum == target) {
                return mid;
            }

            if (midNum > target) {
                end = mid - 1;
            }

            if (midNum < target) {
                start = mid + 1;
            }
        }

        return -1;
    }
}
