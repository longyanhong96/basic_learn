package algorithmPlan.introduction;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/12 2:49 下午
 */
public class IsPowerOfTwoTest extends TestCase {

    public void testIsPowerOfTwo() {
        boolean powerOfTwo = IsPowerOfTwo.isPowerOfTwo(4);
        System.out.println("powerOfTwo = " + powerOfTwo);
    }
}