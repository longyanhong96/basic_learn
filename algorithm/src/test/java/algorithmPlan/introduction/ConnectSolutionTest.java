package algorithmPlan.introduction;

import algorithmPlan.Node;
import junit.framework.TestCase;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/8 2:15 下午
 */
public class ConnectSolutionTest extends TestCase {


    Node node;

    @Override
    protected void setUp() throws Exception {
        Node node2 = new Node(2, new Node(4), new Node(5));
        Node node3 = new Node(3, new Node(6), new Node(7));
        node = new Node(1, node2, node3);
    }

    public void testConnect() {
        ConnectSolution.connect(node);
    }
}