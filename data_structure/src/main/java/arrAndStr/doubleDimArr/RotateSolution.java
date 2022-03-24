package arrAndStr.doubleDimArr;

/**
 * @author longyh
 * @Description: 给你一幅由 N × N 矩阵表示的图像，其中每个像素的大小为 4 字节。请你设计一种算法，将图像旋转 90 度。
 * 不占用额外内存空间能否做到？
 * @analysis:
 * @date 2022/3/23 10:16 上午
 */
public class RotateSolution {
    public static void rotate(int[][] matrix) {
        int down = 0;
        int high = matrix.length - 1;

        while (down < high) {
            int[] tmpRow = matrix[down];
            matrix[down] = matrix[high];
            matrix[high] = tmpRow;

            down++;
            high--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}
