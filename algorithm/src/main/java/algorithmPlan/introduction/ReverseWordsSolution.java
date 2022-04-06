package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/4 12:49 上午
 */
public class ReverseWordsSolution {
    public static String reverseWords(String s) {
        char[] charArray = s.toCharArray();

        int slow = 0;

        for (int i = 0; i <= charArray.length; i++) {
            if (i == charArray.length || charArray[i] == 32) {
                reverse(charArray, slow, i - 1);
                slow = i + 1;
            }
        }

        return new String(charArray);
    }

    private static void reverse(char[] charArray, int slow, int fast) {
        while (slow < fast) {

            char tmp = charArray[slow];
            charArray[slow] = charArray[fast];
            charArray[fast] = tmp;

            slow++;
            fast--;
        }
    }
}
