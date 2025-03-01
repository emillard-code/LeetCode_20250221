package com.project;

import com.project.attempt.FindElements;
import com.project.attempt.TreeNode;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

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
