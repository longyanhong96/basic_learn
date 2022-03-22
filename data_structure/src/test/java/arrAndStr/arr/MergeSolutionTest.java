package arrAndStr.arr;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/22 4:16 下午
 */
public class MergeSolutionTest extends TestCase {

    public void testMerge() {
        int[][] nums = {{1, 4}, {0, 2}, {3, 5}};

        int[][] merge = MergeSolution.merge(nums);
        for (int i = 0; i < merge.length; i++) {
            String s = Arrays.toString(merge[i]);
            System.out.println("s = " + s);
        }
    }
}