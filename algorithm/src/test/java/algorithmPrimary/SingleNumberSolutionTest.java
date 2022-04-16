package algorithmPrimary;

import algorithmPrimary.arr.SingleNumberSolution;
import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/13 10:08 上午
 */
public class SingleNumberSolutionTest extends TestCase {

    public void testSingleNumber() {
        int i = SingleNumberSolution.singleNumber(new int[]{4, 1, 2, 1, 2});
        System.out.println("i = " + i);
    }
}