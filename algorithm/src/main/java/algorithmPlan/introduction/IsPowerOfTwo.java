package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/12 2:35 下午
 */
public class IsPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0){
            return false;
        }

        if (n == 1) {
            return true;
        }

        if (n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }
}
