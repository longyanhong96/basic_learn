package arralgorithm;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/15 4:34 下午
 */
public class SortColorsSolutionTest extends TestCase {

    public void testSortColors() {
        int[] ints = {2, 0, 2, 1, 1, 0};
        SortColorsSolution.sortColors(ints);

        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
    }
}