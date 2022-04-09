package algorithmPlan.introduction;

import algorithmPlan.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/8 12:08 下午
 */
public class ConnectSolution {
    public static Node connect(Node root) {

        if (root == null) {
            return null;
        }

        LinkedList<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                Node node = nodes.poll();
                nodes.add(node.left);
                nodes.add(node.right);
                if (i == size -1){
                    node.next = null;
                }else {
                    node.next = nodes.peek();
                }
            }
        }

        return root;
    }
}
