package com.fun.datastructure;

public class BinaryTree {
  private TreeNode root;
  
  public BinaryTree(TreeNode root) {
    this.root = root;
  }
  
  public int height() {
    return root.height();
  }
}
