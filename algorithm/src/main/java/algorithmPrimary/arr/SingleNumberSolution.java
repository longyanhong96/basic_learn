package algorithmPrimary.arr;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/13 10:02 上午
 */
public class SingleNumberSolution {
    public static int singleNumber(int[] nums) {
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            num = num ^ nums[i];
        }
        return num;
    }
}
