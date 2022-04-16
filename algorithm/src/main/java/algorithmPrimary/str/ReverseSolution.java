package algorithmPrimary.str;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/13 10:28 上午
 */
public class ReverseSolution {
    public int reverse(int x) {
        while (x != 0) {
            int num = x % 10;
            x = x / 10;
        }
        return 0;
    }
}
