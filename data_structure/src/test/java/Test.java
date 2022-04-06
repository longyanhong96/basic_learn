/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/30 22:43
 */
public class Test {

    @org.junit.Test
    public void test1() {
        int dept = 0;
        fun(dept);

        Integer num = new Integer(0);
        System.out.println("test dept = " + dept);
        fun(num);
        System.out.println("num = " + num);
    }

    public int fun(int dept) {
        dept += 1;
        dept++;
        System.out.println("fun dept = " + dept);
        return dept;
    }
}
