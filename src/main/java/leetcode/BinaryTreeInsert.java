package leetcode;

import java.util.*;

public class BinaryTreeInsert {

      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
        }

        public String toString() {
             return "" + val;
        }
     }

    static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList();
            traverseRecursive(root, result);
            return result;
        }

        public void traverseRecursive(TreeNode node, List<Integer> result) {
            // if tree is empty return
            if (node == null) {
                return;
            }
            // if node's left node is not null, traverseRecursive
            if (node.left != null) {
                traverseRecursive(node.left, result);
            }
            // add the current node as root
            result.add(node.val);
            // if node's right node is not null, traverseRecursive
            if (node.right != null) {
                traverseRecursive(node.right, result);
            }
        }

        public List<Integer> traverseIterative(TreeNode root) {
            Set<Integer[]> re = new HashSet<>();
            List<Integer> result = new ArrayList();
            Stack< TreeNode > stack = new Stack < > ();
            TreeNode curr = root;
            while (curr != null || !stack.isEmpty()) {
                while (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }
                curr = stack.pop();
                result.add(curr.val);
                curr = curr.right;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(solution.inorderTraversal(root));
    }
}
