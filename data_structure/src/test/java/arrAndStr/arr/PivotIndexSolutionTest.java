package arrAndStr.arr;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/22 11:52 上午
 */
public class PivotIndexSolutionTest extends TestCase {

    int[] nums;

    public void setUp() throws Exception {
        super.setUp();


    }

    public void tearDown() throws Exception {
    }

    public void testPivotIndex() {

        int[] nums = {-1, 1, 2};

        int index = PivotIndexSolution.pivotIndex(nums);
        System.out.println("index = " + index);
    }
}