package com.project.attempt;

public class FindElements {

    TreeNode treeNode;

    // This instantiates the FindElements object. If the value of the TreeNode is -1,
    // it is corrupted, and we need to call a helper method to properly recover it.
    public FindElements(TreeNode root) {

        treeNode = root;
        if (root.val == -1) {
            generateValue(root, 0);
        }

    }

    // This method searches for int target within the TreeNode of the current FindElements
    // object, and searches the TreeNode object in lower branches to see if the value exists there.
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

    // This helper method generates values for the tree node structure as per challenge specifications.
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
