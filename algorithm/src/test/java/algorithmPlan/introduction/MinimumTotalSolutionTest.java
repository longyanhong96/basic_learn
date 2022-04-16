package algorithmPlan.introduction;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/12 2:20 下午
 */
public class MinimumTotalSolutionTest extends TestCase {

    public void testMinimumTotal() {
        List<List<Integer>> list = new ArrayList<>();
        // [[2],[3,4],[6,5,7],[4,1,8,3]]
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(6,5,7));
        list.add(Arrays.asList(4,1,8,3));

        int i = MinimumTotalSolution.minimumTotal(list);
        System.out.println("i = " + i);
    }
}