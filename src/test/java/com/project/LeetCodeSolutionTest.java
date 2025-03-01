package com.project;

import com.project.solution.FindElements;
import com.project.solution.TreeNode;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    FindElements findElements;
    TreeNode root;

    @BeforeEach
    public void init() {

        root = new TreeNode(-1, null, new TreeNode(-1));

    }

    @Test
    public void findTest() {

        findElements = new FindElements(root);

        assertFalse(findElements.find(1));
        assertTrue(findElements.find(2));

    }

}
