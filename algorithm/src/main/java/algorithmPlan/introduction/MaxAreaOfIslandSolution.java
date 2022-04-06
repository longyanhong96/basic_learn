package algorithmPlan.introduction;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/6 23:00
 */
public class MaxAreaOfIslandSolution {

    // dsf
    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    int area = dsf(grid, 0, i, j, 2);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
    }

    private static int dsf(int[][] grid, int area, int sr, int sc, int newNum) {
        if (sr < 0 || sc < 0 || sr >= grid.length || sc >= grid[0].length || grid[sr][sc] != 1 || grid[sr][sc] == newNum) {
            return area;
        }

        area += 1;
        grid[sr][sc] = newNum;
        area = dsf(grid, area, sr - 1, sc, newNum);
        area = dsf(grid, area, sr + 1, sc, newNum);
        area = dsf(grid, area, sr, sc - 1, newNum);
        area = dsf(grid, area, sr, sc + 1, newNum);

        return area;
    }
}
