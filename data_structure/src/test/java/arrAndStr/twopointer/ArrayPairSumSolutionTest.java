package arrAndStr.twoPointer;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/26 15:02
 */
public class ArrayPairSumSolutionTest extends TestCase {

    public void testArrayPairSum() {

        int[] nums = {6,2,6,5,1,2};
        int sum = ArrayPairSumSolution.arrayPairSum(nums);
        System.out.println(sum);
    }
}