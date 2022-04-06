package algorithmPlan.introduction;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/5 11:03 下午
 */
public class LengthOfLongestSubstringSolutionTest extends TestCase {

    public void testLengthOfLongestSubstring() {
        int length = LengthOfLongestSubstringSolution.lengthOfLongestSubstring("abcabcdabcde");

        System.out.println("length = " + length);
    }
}