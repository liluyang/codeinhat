package com.fun.datastructure;

public class TreeNode {
  public int value;
  public TreeNode left;
  public TreeNode right;
  
  public TreeNode(int value) {
    this.value = value;
  }
  
  public int height() {
    return height(this);
  }
  
  private int height(TreeNode node) {
    return node == null ? 0 : Math.max(height(node.left), height(node.right));
  }
  
  public boolean equals(TreeNode node) {
    return equals(this, node);
  }
  
  private boolean equals(TreeNode node1, TreeNode node2) {
    if (node1 == null || node2 == null) return node1 == node2;
    return node1.value == node2.value 
        && equals(node1.left, node2.left) 
        && equals(node1.right, node2.right);
  }
  
  public String preorder() {
    return preorder(this);
  }
  
  private String preorder(TreeNode node) {
    if (node == null) return "";
    return node.value + preorder(node.left) + preorder(node.right);
  }
  
  public String inorder() {
    return inorder(this);
  }
  
  private String inorder(TreeNode node) {
    if (node == null) return "";
    return inorder(node.left) + node.value + inorder(node.right);
  }
  
  public String postorder() {
    return postorder(this);
  }
  
  private String postorder(TreeNode node) {
    if (node == null) return "";
    return postorder(node.left) + postorder(node.right) + node.value;
  }
}
