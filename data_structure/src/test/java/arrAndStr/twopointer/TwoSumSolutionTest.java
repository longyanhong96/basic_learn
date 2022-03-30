package arrAndStr.twopointer;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/28 9:55 上午
 */
public class TwoSumSolutionTest extends TestCase {

    public void testTwoSum() {
        int[] twoSum = TwoSumSolution.twoSum(new int[]{-1,0}, -1);

        System.out.println(Arrays.toString(twoSum));
    }
}