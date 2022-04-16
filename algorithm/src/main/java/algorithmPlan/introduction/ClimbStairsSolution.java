package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/11 3:33 下午
 */
public class ClimbStairsSolution {
    public static int climbStairs(int n) {
        int[] stairs = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                stairs[i] = 1;
            } else if (i == 2) {
                stairs[i] = 2;
            } else {
                stairs[i] = stairs[i - 1] + stairs[i - 2];
            }
        }
        return stairs[n];
    }
}
