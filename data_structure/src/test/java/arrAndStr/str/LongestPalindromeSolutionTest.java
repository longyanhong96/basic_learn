package arrAndStr.str;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/4 1:41 下午
 */
public class LongestPalindromeSolutionTest extends TestCase {

    public void testLongestPalindrome() {
        String longestPalindrome = LongestPalindromeSolution.longestPalindrome("bb");
        System.out.println("longestPalindrome = " + longestPalindrome);
    }
}