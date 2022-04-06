package algorithmPlan.introduction;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/31 2:40 下午
 */
public class SearchSolutionTest extends TestCase {

    public void testSearch() {
        int[] nums = {5};
        int search = SearchSolution.search(nums, 5);
        System.out.println("search = " + search);

    }
}