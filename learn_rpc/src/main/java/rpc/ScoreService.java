package rpc;

import bean.Score;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 5:26 下午
 */
public interface ScoreService {
    Score findScoreById(int id);
}
