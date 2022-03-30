package arrAndStr.twopointer;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/28 2:39 下午
 */
public class MinSubArrayLenSolutionTest extends TestCase {

    // 5
    //[2,3,1,1,1,1,1]
    public void testMinSubArrayLen() {
        int len = MinSubArrayLenSolution.minSubArrayLen(5, new int[]{2,3,1,1,1,1,1});
        System.out.println(len);
    }
}