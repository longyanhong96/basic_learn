package algorithmPlan.introduction;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/1 10:13 上午
 */
public class RotateSolutionTest extends TestCase {

    public void testRotate() {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        RotateSolution.rotate(nums, 7);

        System.out.println(Arrays.toString(nums));
    }
}