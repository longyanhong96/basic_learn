package algorithmPlan.introduction;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/7 0:00
 */
public class CheckInclusionSolutionTest extends TestCase {

    public void testCheckInclusion() {

        boolean b = CheckInclusionSolution.checkInclusion("adc", "dcda");
        System.out.println("b = " + b);
    }
}