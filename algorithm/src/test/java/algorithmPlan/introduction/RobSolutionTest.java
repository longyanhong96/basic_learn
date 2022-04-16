package algorithmPlan.introduction;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/12 9:56 上午
 */
public class RobSolutionTest extends TestCase {

    public void testRob() {
        int rob = RobSolution.rob(new int[]{1, 2, 3, 1});
        System.out.println("rob = " + rob);
    }
}