package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/5 10:36 下午
 */
public class LengthOfLongestSubstringSolution {
    public static int lengthOfLongestSubstring(String s) {

        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for (int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        int start = 0; // 窗口开始位置
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}

/**
 * int maxLength = 0;
 * int index = 0;
 * <p>
 * int i = 0;
 * for (; i < s.length(); i++) {
 * for (int j = index; j < i; j++) {
 * if (s.charAt(j) == s.charAt(i)) {
 * maxLength = Math.max(maxLength, i - index);
 * index = j + 1;
 * }
 * }
 * }
 * <p>
 * maxLength = Math.max(maxLength, i - index);
 * <p>
 * return maxLength;
 */