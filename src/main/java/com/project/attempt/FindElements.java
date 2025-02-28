package com.project.attempt;

public class FindElements {

    TreeNode treeNode;

    public FindElements(TreeNode root) {

        treeNode = root;
        if (root.val == -1) {
            generateValue(root, 0);
        }

    }

    public boolean find(int target) {

        if (treeNode.val == target) { return true; }

        if (treeNode.left != null) {
            FindElements left = new FindElements(treeNode.left);
            if (left.find(target)) { return true;}
        }

        if (treeNode.right != null) {
            FindElements right= new FindElements(treeNode.right);
            if (right.find(target)) { return true;}
        }

        return false;

    }

    private void generateValue(TreeNode root, int value) {

        root.val = value;

        if (root.left != null) {
            generateValue(root.left, value * 2 + 1);
        }

        if (root.right != null) {
            generateValue(root.right, value * 2 + 2);
        }

    }

}
