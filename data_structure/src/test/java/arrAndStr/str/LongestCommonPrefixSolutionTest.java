package arrAndStr.str;

import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/24 10:04 上午
 */
public class LongestCommonPrefixSolutionTest extends TestCase {

    public void testLongestCommonPrefix() {
        String[] str = {"dog", "racecar", "car" }; //{"flower","flow","flight"};

        String s = LongestCommonPrefixSolution.longestCommonPrefix(str);
        System.out.println("s = " + s);
    }
}