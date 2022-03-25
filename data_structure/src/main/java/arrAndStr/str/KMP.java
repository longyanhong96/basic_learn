package arrAndStr.str;

/**
 * @author longyh
 * @Description: KMP算法
 * @analysis:
 * @date 2022/3/25 10:54 上午
 */
public class KMP {

    public static int getStartIndex(String haystack, String needle) {
        int sourceLength = haystack.length();
        int targetLength = needle.length();

        if (targetLength == 0 ) {
            return 0;
        }

        int[] next = getNext(needle.toCharArray());

        int sourceIndex = 0;
        int targetIndex = 0;

        while (sourceIndex < sourceLength && targetIndex < targetLength) {

            if (targetIndex < 0 || haystack.charAt(sourceIndex) == needle.charAt(targetIndex)) {
                sourceIndex++;
                targetIndex++;
            } else {
                targetIndex = next[targetIndex];
            }
        }

        if ( targetIndex == targetLength) {
            return sourceIndex - targetIndex;
        }
        return -1;
    }

    public static int[] getNext(char[] chars) {
        int[] next = new int[chars.length];
        int j = 0, k = -1;
        next[j] = k;
        while (j < chars.length - 1) {
            if (k == -1 || chars[j] == chars[k]) {
                j++;
                k++;
                next[j] = k;
            } else {
                k = next[k];
            }
        }
        return next;
    }
}
