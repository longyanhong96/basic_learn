package arrAndStr.str;

/**
 * @author longyh
 * @Description:
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * https://leetcode-cn.com/leetbook/read/array-and-string/conm7/
 *
 * @analysis:
 * @date 2022/3/24 10:47 上午
 */
public class LongestPalindromeSolution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);


        }

        return "";
    }
}
