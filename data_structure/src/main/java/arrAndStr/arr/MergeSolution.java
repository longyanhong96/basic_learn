package arrAndStr.arr;

import java.util.Arrays;

/**
 * @author longyh
 * @Description: 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/c5tv3/
 * @analysis:
 * @date 2022/3/22 3:24 下午
 */
public class MergeSolution {
    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int j = 0;
        int currentMinVal = intervals[0][0];
        int currentMaxVal = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            // 有交集
            if (interval[0] <= currentMaxVal) {
                intervals[j][0] = Math.min(currentMinVal, intervals[i][0]);
                intervals[j][1] = Math.max(currentMaxVal, intervals[i][1]);
                currentMinVal = intervals[j][0];
                currentMaxVal = intervals[j][1];
            } else {
                currentMinVal = interval[0];
                currentMaxVal = interval[1];
                j++;
                intervals[j] = intervals[i];
            }
        }

        int[][] mergeVal = new int[j + 1][2];
        for (int i = 0; i <= j; i++) {
            mergeVal[i] = intervals[i];
        }

        return mergeVal;
    }
}
