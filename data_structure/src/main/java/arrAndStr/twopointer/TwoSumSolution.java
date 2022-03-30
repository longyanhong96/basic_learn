package arrAndStr.twopointer;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/28 9:49 上午
 */
public class TwoSumSolution {
    public static int[] twoSum(int[] numbers, int target) {
        int startIndex = 0;
        int endIndex = numbers.length - 1;

        while (startIndex < endIndex) {
            int startNum = numbers[startIndex];
            int endNum = numbers[endIndex];

            int targetNum = target - startNum;
            if (endNum == targetNum) {
                break;
            }

            if (endNum > targetNum) {
                endIndex--;
            } else {
                startIndex++;
            }
        }

        return new int[]{startIndex + 1, endIndex + 1};
    }
}
