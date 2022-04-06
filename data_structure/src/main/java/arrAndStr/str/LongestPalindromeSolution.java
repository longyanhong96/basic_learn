package arrAndStr.str;

/**
 * @author longyh
 * @Description: 给你一个字符串 s，找到 s 中最长的回文子串。
 * https://leetcode-cn.com/leetbook/read/array-and-string/conm7/
 * @analysis:
 * @date 2022/3/24 10:47 上午
 */
public class LongestPalindromeSolution {
    public static String longestPalindrome(String s) {
        // i:表示从那个char开始，j表示char位置结束
        boolean[][] judge = new boolean[s.length()][s.length()];

        int maxLength = 1;
        int maxStartIndex = 0;

        // 字符为1的时候都是回文字符串
        for (int i = 0; i < s.length(); i++) {
            judge[i][i] = true;
        }

        // 判断长度为2的子字符串是否为回文字符串
        for (int L = 2; L <= s.length(); L++) {
            // 从第一个字符开始，每次拿长度为L的字符串判断
            for (int i = 0; i <= s.length() - L; i++) {
                int j = L + i - 1;

                if (j >= s.length()) {
                    continue;
                }

                if (s.charAt(i) != s.charAt(j)) {
                    judge[i][j] = false;
                } else {
                    if (L <= 3) {
                        judge[i][j] = true;
                    } else {
                        judge[i][j] = judge[i + 1][j - 1];
                    }

                    if (judge[i][j]) {
                        maxLength = L;
                        maxStartIndex = i;
                    }
                }
            }
        }

        return s.substring(maxStartIndex, maxStartIndex + maxLength);
    }
}
