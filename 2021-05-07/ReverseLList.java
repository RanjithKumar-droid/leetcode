package linkedlist;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLList {

	class Node{
		int data;
		Node next;
		Node(int val){
			this.data = val;
		}
	}
	Node head = null;
	
	public Node addToEnd(int inp_data) {
		
		Node n = new Node(inp_data);
		if(head == null) {
			head = n;
		} else {
			Node curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = n;
		}
		return head;
	}
	
	public Node reverse(Node head) {
		Stack<Node> stk = new Stack<>();
		Node temp = head;
		
		while(temp.next != null) {
			stk.add(temp);
			temp = temp.next;
		}
		Node reverse = new Node(0);
		head = reverse;
		while(!stk.isEmpty()) {
			Node current = stk.pop();
			head.next = new Node(current.data);
			head = head.next;
		}
		while(reverse.next != null) {
			System.out.print(reverse.next.data);
			reverse = reverse.next;
		}
		return reverse.next;
	}
	
	public void print(Node head) {
		Node temp = head;
		while(temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		ReverseLList obj = new ReverseLList();
		
		obj.addToEnd(1);
		obj.addToEnd(2);
		obj.addToEnd(3);
		obj.addToEnd(4);
		obj.addToEnd(3);
		obj.addToEnd(5);
		obj.addToEnd(9);
		obj.print(obj.head);
		obj.reverse(obj.head);
		
	}
}
