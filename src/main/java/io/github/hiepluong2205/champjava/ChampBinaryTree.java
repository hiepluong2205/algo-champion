/*
 * Name: Hiep Tuan Luong
 * Class & Section: CIS 35A-36Y
 * Assignment Number:
 * Due Date:
 * Date Submitted:
 *
 * - https://deanza.instructure.com/courses/23660/assignments
 * - https://discord.com/channels/927730169152675841/927730169731493972
 */

package io.github.hiepluong2205.champjava;

import java.util.List;

public class ChampBinaryTree {
    // https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/928/
    public List<Integer> preorderTraversal(TreeNode root) {
        return null;
    }

    // https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/929/
    public List<Integer> inorderTraversal(TreeNode root) {

        return null;
    }

    // https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/930/
    public List<Integer> postorderTraversal(TreeNode root) {

        return null;
    }

    // https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/931/
    public List<List<Integer>> levelOrder(TreeNode root) {
        return null;
    }

    private int answer; // don't forget to initialize answer before call maximum_depth
    private void maximum_depth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        maximum_depth(root.left, depth + 1);
        maximum_depth(root.right, depth + 1);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
