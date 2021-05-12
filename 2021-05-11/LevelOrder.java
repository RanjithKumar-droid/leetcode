package binarytree;

import java.util.*;

public class LevelOrder {
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int val){
			this.data = val;
		}
	}

	public List<List<Integer>> levelorder(Node root){
		
		List<List<Integer>> result = new ArrayList<>();
		
		if(root == null) return null;
		
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			
			 int levelsize = queue.size();
           List<Integer> level = new ArrayList<>();
          
           for(int i=0; i<levelsize; i++){
               Node node = queue.poll();
               level.add(node.data);
              
               if(node.left != null){
                   queue.offer(node.left);
               }
               
               if(node.right != null){
                   queue.offer(node.right);
               }
           }
           result.add(level);
       }
		return result;
		
	}
	
	public List<List<Integer>> levelorder(Node root){
		
		List<List<Integer>> result = new ArrayList<>();
		
		if(root == null) return null;
		
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			
			 int levelsize = queue.size();
           List<Integer> level = new ArrayList<>();
          
           for(int i=0; i<levelsize; i++){
               Node node = queue.poll();
               level.add(node.data);
              
               if(node.left != null){
                   queue.offer(node.left);
               }
               
               if(node.right != null){
                   queue.offer(node.right);
               }
           }
           result.add(level);
       }
		return result;
		
	}
	public static void main(String[] args) {
		LevelOrder obj = new LevelOrder();
		Node root = obj.createtree();
		obj.levelorder(root);
	}
}
