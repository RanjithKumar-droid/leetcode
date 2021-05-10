// https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1208/
package linkedlist;

import linkedlist.ReverseLList.Node;

public class OddEven {
	class Node{
		int data;
		Node next;
		Node(int val){
			this.data = val;
		}
	}
	Node head = null;
	public Node addToEnd(int inp_data) {
	Node n;
	Node curr;
    n = new Node(inp_data);
	
	if(head == null) {
		head = n;
	}
	else {
		curr = head;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = n;
	}
	return head;
	}
	
	public void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}
	
	 public Node oddEvenList(Node head) {
		 
	        if (head == null) return null;
	        
	        Node odd = head, even = head.next, evenHead = even;
	        
	        while (even != null && even.next != null) {
	        	
	            odd.next = even.next;
	            odd = odd.next;
	            even.next = odd.next;
	            even = even.next;
	            
	        }
	        odd.next = evenHead;
	        return head;
	    }
	
	public static void main(String[] args) {
		
		OddEven ref = new OddEven();
		ref.addToEnd(1);
		ref.addToEnd(2);
		ref.addToEnd(3);
		ref.addToEnd(4);
		ref.addToEnd(5);
		ref.oddEvenList(ref.head);
	}
}
