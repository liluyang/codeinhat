package com.fun.set1;

import org.testng.annotations.Test;

import com.fun.datastructure.TreeNode;

public class Solution018 extends Problem018 {
  @Override
  public void invert(TreeNode node) {
    if (node == null) return;
    invert(node.left);
    invert(node.right);
    TreeNode t = node.left;
    node.left = node.right;
    node.right = t;
  }
  
  @Test
  public void test() {
  }
}
