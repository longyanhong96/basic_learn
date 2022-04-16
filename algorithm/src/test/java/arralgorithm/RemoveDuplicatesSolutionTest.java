package arralgorithm;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/14 3:17 下午
 */
public class RemoveDuplicatesSolutionTest extends TestCase {

    public void testRemoveDuplicates() {
        int[] ints = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int removeDuplicates = RemoveDuplicatesSolution.removeDuplicates(ints);
        System.out.println("removeDuplicates = " + removeDuplicates);
        System.out.println(Arrays.toString(ints));
    }
}