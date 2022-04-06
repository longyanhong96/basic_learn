package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/6 21:41
 */

// todo : bsf
public class FloodFillSolution {

    // dsf 深度遍历
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int sourceNum = image[sr][sc];

        dsf(image, sr, sc, sourceNum, newColor);
        return image;
    }

    public static void dsf(int[][] image, int sr, int sc, int oldNum, int newNum) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != oldNum || image[sr][sc] == newNum)
            return;

        image[sr][sc] = newNum;
        dsf(image, sr - 1, sc, oldNum, newNum);
        dsf(image, sr + 1, sc, oldNum, newNum);
        dsf(image, sr, sc - 1, oldNum, newNum);
        dsf(image, sr, sc + 1, oldNum, newNum);

    }


}
