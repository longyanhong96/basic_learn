package arrAndStr.doubleDimArr;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/23 2:35 下午
 */
public class SetZeroesSolutionTest extends TestCase {

    public void testSetZeroes() {
        // [[0,0,0,5],[4,3,1,4],[0,1,1,4],[1,2,1,3],[0,0,1,1]]
        int[][] nums = {{0, 0, 0, 5}, {4, 3, 1, 4}, {0, 1, 1, 4}, {1, 2, 1, 3}, {0, 0, 1, 1}};

        SetZeroesSolution.setZeroes(nums);

        for (int i = 0; i < nums.length; i++) {
            int[] num = nums[i];
            System.out.println(Arrays.toString(num));
        }
    }
}