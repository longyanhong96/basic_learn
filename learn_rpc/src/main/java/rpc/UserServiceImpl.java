package rpc;

import bean.Score;
import bean.User;
import lombok.extern.slf4j.Slf4j;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/28 12:07 下午
 */
@Slf4j
public class UserServiceImpl implements UserService, ScoreService {
    @Override
    public User findUserById(int id) {
        return new User(id, "test");
    }

    @Override
    public boolean saveUserById(int id, String name) {
        log.info("save user :{} success!", new User(id, name));
        return true;
    }

    @Override
    public String test() {
        return "test";
    }

    @Override
    public void test1() {

    }

    @Override
    public Score findScoreById(int id) {
        return new Score(id, 90, 90, 98);
    }

    public static void main(String[] args) {
        Class<?>[] declaredClasses = UserServiceImpl.class.getDeclaredClasses();
        Class<?>[] interfaces = UserServiceImpl.class.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("anInterface.getName() = " + anInterface.getName());
        }

    }
}
