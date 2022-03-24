package arrAndStr.doubleDimArr;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/23 10:39 上午
 */
public class RotateSolutionTest extends TestCase {

    public void testRotate() {
//        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nums = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        RotateSolution.rotate(nums);

        for (int i = 0; i < nums.length; i++) {
            int[] num = nums[i];
            System.out.println(Arrays.toString(num));
        }
    }
}