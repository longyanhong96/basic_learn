package arrAndStr.conclusion;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/9 13:52
 */
public class RemoveDuplicatesSolutionTest extends TestCase {

    public void testRemoveDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = RemoveDuplicatesSolution.removeDuplicates(nums);
        System.out.println("i = " + i);
        String s = Arrays.toString(nums);
        System.out.println("s = " + s);
    }
}