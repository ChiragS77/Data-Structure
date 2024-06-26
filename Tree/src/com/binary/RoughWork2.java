package com.binary;

public class RoughWork2 {

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class BinaryTree {
		static int idx = -1;

		public static Node buildTree(int[] nodes) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
		
		//post order traversal
		
		public static void postorder(Node node) {
			if(node==null) {
				return;
			}
			
			postorder(node.left);
			postorder(node.right);
			System.out.print(" "+node.data);
			
		}
		
	
	}
	
	public static void main(String[] args) {
		int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		
		Node leaf = tree.buildTree(nodes);
		System.out.println(leaf.data+" ");
		
		tree.postorder(leaf);
		
	
	}

}
