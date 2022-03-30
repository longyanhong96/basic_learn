package arrAndStr.twopointer;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/28 11:19 上午
 */
public class FindMaxConsecutiveOnesSolutionTest extends TestCase {

    public void testFindMaxConsecutiveOnes() {
        int maxConsecutiveOnes = FindMaxConsecutiveOnesSolution.findMaxConsecutiveOnes(new int[]{0, 1, 1, 0, 1, 1, 1});
        System.out.println("maxConsecutiveOnes = " + maxConsecutiveOnes);
    }
}