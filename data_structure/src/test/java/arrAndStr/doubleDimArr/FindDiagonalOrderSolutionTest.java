package arrAndStr.doubleDimArr;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/23 22:18
 */
public class FindDiagonalOrderSolutionTest extends TestCase {

    public void testFindDiagonalOrder() {
// [[1,2,3],[4,5,6],[7,8,9]]
        int[][] nums = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        int[] diagonalOrder = FindDiagonalOrderSolution.findDiagonalOrder(nums);
        String str = Arrays.toString(diagonalOrder);

        System.out.println("str = " + str);
    }
}