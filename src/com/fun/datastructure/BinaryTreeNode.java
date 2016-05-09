package com.fun.datastructure;

public class BinaryTreeNode {
  public int value;
  public BinaryTreeNode left;
  public BinaryTreeNode right;
  
  public BinaryTreeNode(int value) {
    this.value = value;
  }
  
  public int height() {
    int leftHeight = left == null ? 0 : left.height();
    int rightHeight = right == null ? 0 : right.height();
    return Math.max(leftHeight, rightHeight);
  }
  
  public boolean equals(BinaryTreeNode node) {
    return equals(this, node);
  }
  
  private boolean equals(BinaryTreeNode node1, BinaryTreeNode node2) {
    if (node1 == null || node2 == null) return node1 == node2;
    return node1.value == node2.value 
        && equals(node1.left, node2.left) 
        && equals(node1.right, node2.right);
  }
  
  public String preorder() {
    return preorder(this);
  }
  
  private String preorder(BinaryTreeNode node) {
    if (node == null) return "";
    return node.value + preorder(node.left) + preorder(node.right);
  }
  
  public String inorder() {
    return inorder(this);
  }
  
  private String inorder(BinaryTreeNode node) {
    if (node == null) return "";
    return inorder(node.left) + node.value + inorder(node.right);
  }
  
  public String postorder() {
    return postorder(this);
  }
  
  private String postorder(BinaryTreeNode node) {
    if (node == null) return "";
    return postorder(node.left) + postorder(node.right) + node.value;
  }
}
