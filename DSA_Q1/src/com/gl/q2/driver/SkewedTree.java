package com.gl.q2.driver;

import com.gl.q2.service.Node;
import com.gl.q2.service.RightSkewedTree;

public class SkewedTree {
	public static void main(String ars[]) {
		
		RightSkewedTree obj = new RightSkewedTree();
		Node node;
		
		node = new Node(50);
		node.left = new Node(30);
		node.right = new Node(60);
		node.left.left = new Node(10);
		node.right.left = new Node(55);
	
		Node rightTree = obj.completeBSTtoSkewed(node);
		System.out.println("The resultant output is: ");
		obj.traverseRightSkewedTree(rightTree);		
		
	}
}
