package algorithmPlan.introduction;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/4 12:55 上午
 */
public class ReverseWordsSolutionTest extends TestCase {

    public void testReverseWords() {
        String words = ReverseWordsSolution.reverseWords("God Ding");
        System.out.println("words = " + words);
    }
}