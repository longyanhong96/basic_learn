package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/1 10:02 上午
 */
public class RotateSolution {
    public static void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }

        int length = nums.length;

        int commonDivisor = commonDivisor(length, k);

        int width = length / commonDivisor;

        int i = 0;
        int s = 0;

        int tmp = nums[0];

        while (i < length) {
            s = (s + k) % length;

            int t = nums[s];
            nums[s] = tmp;
            tmp = t;

            i++;
            if ( i % width == 0 && i < length) {
                s++;
                tmp = nums[s];
            }

        }
    }

    /**
     * 辗转相除法，求最大公约数
     *
     * @param m
     * @param n
     * @return
     */
    public static int commonDivisor(int m, int n) {
        if (m % n == 0) {
            return n;
        }

        return commonDivisor(n, m % n);
    }
}
