package arrAndStr.doubleDimArr;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/23 21:35
 */
public class FindDiagonalOrderSolution {
    public static int[] findDiagonalOrder(int[][] mat) {
        int length = mat.length * mat[0].length;
        int[] orderArr = new int[length];

        /**
         * up: x-1 y+1
         * down: x+1 y-1
         */
        boolean upFlag = true;

        int x = 0;
        int y = 0;
        for (int i = 0; i < length; i++) {
            orderArr[i] = mat[x][y];
            if (upFlag) {
                if (y + 1 >= mat[0].length) {
                    x += 1;
                    upFlag = false;
                } else if (x - 1 < 0) {
                    y += 1;
                    upFlag = false;
                } else {
                    x -= 1;
                    y += 1;
                }
            } else {
                if (x + 1 >= mat.length) {
                    y += 1;
                    upFlag = true;
                } else if (y - 1 < 0) {
                    x += 1;
                    upFlag = true;
                } else {
                    x += 1;
                    y -= 1;
                }
            }
        }


        return orderArr;
    }
}
