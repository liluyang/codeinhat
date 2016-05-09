package com.fun.datastructure;

public class BinaryTree {
  private BinaryTreeNode root;
  
  public BinaryTree(BinaryTreeNode root) {
    this.root = root;
  }
  
  public int height() {
    return root.height();
  }
}
