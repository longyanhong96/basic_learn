package arrAndStr.twopointer;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/25 2:57 下午
 */
public class ReverseStringSolutionTest extends TestCase {

    public void testReverseString() {
        char[] chars = {'h','e','l','l','o'};

        ReverseStringSolution.reverseString(chars);

        String s = Arrays.toString(chars);
        System.out.println("s = " + s);
    }
}