package arrAndStr.twopointer;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/28 10:51 上午
 */
public class RemoveElementSolutionTest extends TestCase {


    public void testRemoveElement() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int element = RemoveElementSolution.removeElement(nums, 3);

        String string = Arrays.toString(nums);
        System.out.println("string = " + string);
        System.out.println("element = " + element);

    }
}