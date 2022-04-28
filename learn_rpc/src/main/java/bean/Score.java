package bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 5:24 下午
 */
@Data
@AllArgsConstructor
public class Score implements Serializable {
    private int id;
    private int chinese;
    private int math;
    private int english;
}
