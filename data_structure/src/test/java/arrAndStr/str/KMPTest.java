package arrAndStr.str;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/25 10:57 上午
 */
public class KMPTest extends TestCase {

    public void testGetNext() {

        String haystack = "aaa";
        String needle = "aaa";

        int startIndex = KMP.getStartIndex(haystack, needle);
        System.out.println("startIndex = " + startIndex);


    }
}