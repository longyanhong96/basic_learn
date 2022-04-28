package rpc;

import bean.User;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 12:05 下午
 */
public interface UserService {
    /**
     * find user
     * @param id
     * @return
     */
    User findUserById(int id);

    boolean saveUserById(int id,String name);

    String test();

    void test1();
}
