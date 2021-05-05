//      https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1214/

package linkedlist;

import linkedlist.Cycle.Node;

public class Cycle2 {

	public static class Node{
		int data;
		Node next;
		Node(int val){
			this.data = val;
			this.next = null;
		}
	}
//	static Node head = null;
	public static Node iscycle(Node head) {
		if(head == null || head.next == null)  return null;
		 
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		
		if(fast == null || fast.next == null) return null;
		slow = head;
		while(fast != slow) {
			slow = slow.next;
			fast = fast.next;
		}
		System.out.println(slow.data);
		return slow;
		
	}
	public static Node makeCycle(Node head_ref, int k) {
		 Node temp = head_ref; 
		    int count = 1; 
		    while (count < k)
		    { 
		        temp = temp.next; 
		        count++; 
		    } 
		  
		    // backup the joint point 
		    Node joint_point = temp; 
		  
		    // traverse remaining nodes 
		    while (temp.next != null) 
		        temp = temp.next; 
		  
		    // joint the last node to k-th element 
		    temp.next = joint_point; 
		    return head_ref;
	}
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		head.next = second;
		second.next = third;
		third.next = fourth;
		makeCycle(head,2);
		 iscycle(head);
	}
}
