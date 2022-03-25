package arrAndStr.twopointer;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/25 2:54 下午
 */
public class ReverseStringSolution {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;

            start++;
            end--;
        }
    }
}
