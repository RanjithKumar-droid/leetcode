// https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/536/
package binarytree;

import java.util.Scanner;

public class Symmetric{
	
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int val){
			this.data = val;
		}
	}
	
	public Node createtree() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		int data = s.nextInt();
		Node root = null;
		
		if(data == -1)
			return null;
		
		root = new Node(data);
		
		System.out.println("Enter left of "+data);
		root.left = createtree();
		
		System.out.println("Enter left of "+data);
		root.right = createtree();
		
		return root;
	}
	
	public boolean isSymmetric(Node root) {
		if(root == null) return true;
		return isSymmetric(root,root);
	}
	
	public boolean isSymmetric(Node left, Node right) {
		
		if(left == null || right == null) 
			return true;
		
		if(left.data != right.data) 
			return false;
		
		return isSymmetric(left.left,right.right) && isSymmetric(left.right, right.left);
	}
	public static void main(String[] args) {
		
		Symmetric obj = new Symmetric();
		Node root = obj.createtree();
		obj.isSymmetric(root);
		
	}
}
