package binarytree;

import java.util.*;
import java.util.stream.Stream;

import binarytree.InputBinaryTree.Node;

public class LevelOrder{
	class Node{
		int data;
		Node left;
		Node right;
		
		Node(int val){
			this.data = val;
		}
	}
	
	public Node createtree() {
		Scanner sc = new Scanner(System.in);
		Node root = null;
		System.out.println("Enter data");
		int data = sc.nextInt();
		
		if(data == -1) return null;
		
		root = new Node(data);
		
		System.out.println("Enter left for "+data);
		root.left = createtree();
		
		System.out.println("Enter right for "+data);
		root.right = createtree();
		
		return root;
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
		Stream.of(result.toString())
		.forEach(System.out::println);
		return result;
	}
	
	public static void main(String[] args) {
		LevelOrder obj = new LevelOrder();
		Node root = obj.createtree();
		obj.levelorder(root);
	}
}
