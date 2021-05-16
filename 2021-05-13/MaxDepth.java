// https://leetcode.com/explore/learn/card/data-structure-tree/17/solve-problems-recursively/535/
package binarytree;

import java.util.Scanner;

public class MaxDepth{
	
	class Node{
		int data;
		Node left;
		Node rit;
		Node(int val){
			this.data = val;
		}
	}
	
	public Node createtree() {
		
		Scanner s = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter data");
		int data = s.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for "+data);
		root.left = createtree();
		
		System.out.println("Enter rit for "+data);
		root.rit = createtree();
		
		return null;
	}
	
	public int Maxdept(Node root) {
		 if(root==null)
	            return 0;
	        int l = Maxdept(root.left);
	        int r=Maxdept(root.rit);
	        if(l>r) {
	        	System.out.println(l+1);
	            return l+1;
	            }
	        else {
	        	System.out.println(r+1);
	            return r+1;
	            }
	    }
		
	
	public static void main(String[] args) {
		MaxDepth obj = new MaxDepth();
		Node root = obj.createtree();
		obj.Maxdept(root);
	}
}
