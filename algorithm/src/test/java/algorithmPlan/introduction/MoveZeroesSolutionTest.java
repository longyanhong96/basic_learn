package algorithmPlan.introduction;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/2 10:16 上午
 */
public class MoveZeroesSolutionTest extends TestCase {

    public void testMoveZeroes() {
        int[] nums = {1};
        MoveZeroesSolution.moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}