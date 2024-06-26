package com.binary;

import java.util.ArrayList;



public class BinaryTreeXt {

	static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinaryTree{
		static int idx = -1;
		static ArrayList<Node> list = new ArrayList<Node>();
		
		public static Node buildTree(int[] nodes) {
			idx++;
			
			if(nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			list.add(newNode);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
		
		//pre-order traversal
		public static void preorder(Node root) {
			if(root == null) {
				return;
			}
			
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
		//In-order traversal
		public static void inorder(Node node) {			
			if(node == null) {
				return;
			}
			preorder(node.left);
			System.out.print(" "+node.data);
			preorder(node.right);
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		
		 Node leaf= tree.buildTree(nodes);
		 System.out.println(leaf.data);
		 
		 tree.preorder(leaf);
		 
		 tree.inorder(leaf);
		 
		 
		 
		
		
		
	}
}
