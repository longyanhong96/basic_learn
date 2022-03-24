package arrAndStr.str;

/**
 * @author longyh
 * @Description: 给你一个字符串 s ，颠倒字符串中 单词 的顺序。
 * 单词 是由非空格字符组成的字符串。s 中使用至少一个空格将字符串中的 单词 分隔开。
 * 返回 单词 顺序颠倒且 单词 之间用单个空格连接的结果字符串。
 * 注意：输入字符串 s中可能会存在前导空格、尾随空格或者单词间的多个空格。返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/crmp5/
 * @analysis:
 * @date 2022/3/24 11:17 上午
 */
public class ReverseWordsSolution {

    /**
     * 自己写的，很 low
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        String str = s.trim();

        if (str.length()==1){
            return str;
        }

        int left = str.length() - 1;
        int right = str.length() - 1;

        StringBuffer buffer = new StringBuffer();

        for (; left > 0; left--) {
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);
            if (leftChar == 32) {
                if (rightChar != 32) {
                    buffer.append(str.substring(left + 1, right + 1)).append(" ");
                    right = left;
                }
            } else {
                if (rightChar == 32) {
                    right = left;
                }
            }
        }

        if (left != right) {
            buffer.append(str.substring(left, right + 1));
        }

        return buffer.toString().trim();
    }
}
