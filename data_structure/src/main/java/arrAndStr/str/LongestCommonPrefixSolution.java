package arrAndStr.str;

/**
 * @author longyh
 * @Description: 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * @analysis:
 * @date 2022/3/24 9:47 上午
 */
public class LongestCommonPrefixSolution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuffer buffer = new StringBuffer();
        buffer.append(strs[0].toCharArray());
        for (int i = 1; i < strs.length; i++) {
            char[] currentCharArr = strs[i].toCharArray();
            int length = Math.min(buffer.length(), currentCharArr.length);
            int j = 0;
            for (j = 0; j < length; j++) {
                char charAt = buffer.charAt(j);
                char currentChar = currentCharArr[j];
                if (charAt != currentChar) {
                    break;
                }
            }
            buffer.delete(j, buffer.length());
            if (buffer.length() == 0) {
                return "";
            }
        }

        return buffer.toString();
    }


    // 添加一个 分治 的方法
}
