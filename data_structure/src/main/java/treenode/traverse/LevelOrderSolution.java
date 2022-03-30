package treenode.traverse;

import treenode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/3/29 10:50 上午
 */
public class LevelOrderSolution {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();
        if (root != null) {
            treeNodeQueue.offer(root);
        }

        List<List<Integer>> list = new ArrayList<>();

        int currentSize = treeNodeQueue.size();
        List<Integer> integers = new ArrayList<>();
        while (currentSize != 0) {
            TreeNode treeNode = treeNodeQueue.poll();

            if (treeNode.left != null) {
                treeNodeQueue.offer(treeNode.left);
            }

            if (treeNode.right != null) {
                treeNodeQueue.offer(treeNode.right);
            }

            integers.add(treeNode.val);

            currentSize--;

            if (currentSize == 0) {
                list.add(integers);
                integers = new ArrayList<>();
                currentSize = treeNodeQueue.size();
            }
        }

        return list;
    }
}


//        while (treeNodeQueue.peek() != null || nextLevelNode.size() != 0) {
//            List<Integer> integers = new ArrayList<>();
//
//            while (treeNodeQueue.peek() != null) {
//                TreeNode treeNode = treeNodeQueue.poll();
//
//                if (treeNode.left != null) {
//                    nextLevelNode.add(treeNode.left);
//                }
//
//                if (treeNode.right != null) {
//                    nextLevelNode.add(treeNode.right);
//                }
//
//                integers.add(treeNode.val);
//            }
//
//            treeNodeQueue.addAll(nextLevelNode);
//            nextLevelNode.clear();
//            list.add(integers);
//
//        }