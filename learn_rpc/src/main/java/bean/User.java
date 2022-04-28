package bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 11:15 上午
 */
@Data
@AllArgsConstructor
public class User implements Serializable {
    private int id;
    private String name;

    public User() {
    }
}
