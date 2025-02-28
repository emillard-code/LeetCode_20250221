package com.project.solution;

public class LeetCodeSolution {

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(-1, null, new TreeNode(-1));
        FindElements findElements1 = new FindElements(root1);
        System.out.println(findElements1.find(1));
        System.out.println(findElements1.find(2));

        System.out.println();

        TreeNode root2 = new TreeNode(-1,
                new TreeNode(-1, new TreeNode(-1), new TreeNode(-1)),
                new TreeNode(-1));
        FindElements findElements2 = new FindElements(root2);
        System.out.println(findElements2.find(1));
        System.out.println(findElements2.find(3));
        System.out.println(findElements2.find(5));

        System.out.println();

        TreeNode root3 = new TreeNode(-1, null,
                new TreeNode(-1, new TreeNode(-1, new TreeNode(-1), null), null));
        FindElements findElements3 = new FindElements(root3);
        System.out.println(findElements3.find(2));
        System.out.println(findElements3.find(3));
        System.out.println(findElements3.find(4));
        System.out.println(findElements3.find(5));

    }

}
