package arrAndStr.conclusion;

import junit.framework.TestCase;

import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/2 2:47 下午
 */
public class GenerateSolutionTest extends TestCase {

    public void testGenerate() {
        List<List<Integer>> generate = GenerateSolution.generate(5);

        for (int i = 0; i < generate.size(); i++) {
            System.out.println(generate.get(i));
        }
    }
}