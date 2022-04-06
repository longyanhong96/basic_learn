package arrAndStr.conclusion;

import junit.framework.TestCase;

import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/2 3:11 下午
 */
public class GetRowSolutionTest extends TestCase {

    public void testGetRow() {
        List<Integer> row = GetRowSolution.getRow(3);
        System.out.println(row);
    }
}