package arrAndStr.str;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/24 11:40 上午
 */
public class ReverseWordsSolutionTest extends TestCase {

    public void testReverseWords() {
        String str = ReverseWordsSolution.reverseWords("  hello world  ");
        System.out.println("str = " + str);
    }
}