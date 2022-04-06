package arrAndStr.conclusion;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/4 12:20 上午
 */
public class FindMinSolutionTest extends TestCase {

    public void testFindMin() {
        int[] nums = {4, 5, 6, 0, 1, 2, 3};
        int min = FindMinSolution.findMin(nums);
        System.out.println("min = " + min);
    }
}