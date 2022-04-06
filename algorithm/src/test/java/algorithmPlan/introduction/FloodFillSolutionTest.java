package algorithmPlan.introduction;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/6 22:18
 */
public class FloodFillSolutionTest extends TestCase {

    int[][] nums;

    @Override
    protected void setUp() throws Exception {
        nums = new int[][]{{0, 0, 0}, {0, 1, 1}};
    }

    public void testFloodFill() {
        FloodFillSolution.floodFill(nums, 1, 1, 1);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Arrays.toString(nums[i]) = " + Arrays.toString(nums[i]));
        }
    }
}