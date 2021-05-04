package linkedlist;

import linkedlist.Linkedlistcycle.Node;

public class Cycle {

	static class Node{
		int data;
		Node next;
	}
	
	static Node push( Node head_ref, int new_data) 
	{ 
	    Node new_node = new Node(); 
	    new_node.data = new_data; 
	    new_node.next = (head_ref); 
	    (head_ref) = new_node; 
	    
	    return head_ref;
	} 
	
	static Node makeloop( Node head_ref, int k) 
	{ 
	    // traverse the linked list until loop 
	    // point not found 
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
	
	public static boolean hasCycle(Node head) {
        if(head == null) return false;
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast != slow){
            
            if(fast == null || fast.next == null) {
            	System.out.println("False");
            	return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("True");
        return true;
        
    }
	
	public static void main(String[] args) {
		
		int k = 3;
		
		Node head = null;
		head = push(head,5);
		head = push(head,4);
		head = push(head,3);
		head = push(head,2);
		head = push(head,1);
		makeloop(head,k);
		hasCycle(head);
	}
}