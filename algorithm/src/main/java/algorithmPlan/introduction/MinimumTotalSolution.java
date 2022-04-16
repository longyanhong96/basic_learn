package algorithmPlan.introduction;

import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/12 11:38 上午
 */
public class MinimumTotalSolution {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int[][] target = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];

        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i - 1 < 0) {
                    target[i][j] = list.get(j);
                } else {
                    if (j - 1 < 0) {
                        target[i][j] = target[i - 1][j] + list.get(j);
                    } else if (j == list.size() - 1) {
                        target[i][j] = target[i - 1][j - 1] + list.get(j);
                    } else {
                        target[i][j] = Math.min(target[i - 1][j - 1] + list.get(j), target[i - 1][j] + list.get(j));
                    }
                }
            }
        }

        int min = target[target.length - 1][0];

        for (int i = 1; i < triangle.get(triangle.size() - 1).size(); i++) {
            min = Math.min(target[target.length - 1][i], min);
        }

        return min;
    }
}
