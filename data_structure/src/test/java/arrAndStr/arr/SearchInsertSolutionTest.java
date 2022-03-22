package arrAndStr.arr;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/22 2:32 下午
 */
public class SearchInsertSolutionTest extends TestCase {

    public void testSearchInsert() {

        int[] nums = {1, 3, 5, 6};
        int target = 0;

        int searchInsert = SearchInsertSolution.searchInsert(nums, target);
        System.out.println("searchInsert = " + searchInsert);
    }
}