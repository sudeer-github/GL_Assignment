package com.gl.q2.service;

public class RightSkewedTree {
	Node prevNode = null;
	Node headNode = null;
	
	public Node completeBSTtoSkewed(Node root) {
		if (root == null) {
			return null;
		}
	
		completeBSTtoSkewed(root.left);
		
		Node rightNode = root.right;
		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else {
			prevNode.right=root;
			root.left = null;
			prevNode = root;
		}
		
		completeBSTtoSkewed(root.right);
		return headNode;
	}
	
	public void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewedTree(root.right);
	}
	
}
