package com.java.interview;
import java.util.HashSet;
import java.util.Set;

import com.java.util.Node;

public class AmazonPhone {
	public static void main(String[] args) {
		AmazonPhone phone = new AmazonPhone();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		
		node4.setLeftNode(node2);
		node4.setRightNode(node6);
		node2.setParentNode(node4);
		node6.setParentNode(node4);
		
		node2.setLeftNode(node1);
		node2.setRightNode(node3);
		node1.setParentNode(node2);
		node3.setParentNode(node2);
		
		node6.setLeftNode(node5);
		node6.setRightNode(node7);
		node5.setParentNode(node6);
		node7.setParentNode(node6);
		
		
		
		Node result = phone.searchNode(1, node4);
		System.out.println(result.getValue());
	}
	
	private Node searchNode (int val, Node root) {
		if (root == null) return null;
		if (root.getValue() == val) return root;
		if (root.getValue() > val) return searchNode(val, root.getLeftNode());
		else {
			Node temp = searchNode(val, root.getRightNode());
			if (temp != null) return temp;
			return root;
		}
	}
	
	/*
	 * 				10
	 * 		2					50
	 * 	1		3		20				70
	 * 				15		30		60		80
	 * 					25		40
	 */
	
	private Node ythSmallestNode (int y, Node root) {
		Node currentNode = root;
		Set<Integer> visitSet = new HashSet<Integer>();
		while (y > 0) {
			if (currentNode.getLeftNode() != null) {
				currentNode = currentNode.getLeftNode();
				while (currentNode.getRightNode()!=null) currentNode = currentNode.getRightNode();
				visitSet.add(currentNode.getValue());
				y --;
			} else {
				
			}
			
		}
		return null;
	}
}
