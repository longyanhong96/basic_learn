package arrAndStr.doubleDimArr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author longyh
 * @Description: 编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。
 * @analysis:
 * @date 2022/3/23 2:18 下午
 */
public class SetZeroesSolution {
    public static void setZeroes(int[][] matrix) {
        Set<Integer> zeroColumn = new HashSet<>();
        Set<Integer> zeroRow = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroColumn.add(j);
                    zeroRow.add(i);
                }
            }

        }

        zeroColumn.forEach(col -> {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        });

        zeroRow.forEach(row -> {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        });

    }
}
