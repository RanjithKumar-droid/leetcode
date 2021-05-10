// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package linkedlist;
// Remove Duplicate from sorted list
public class RemoveDuplicate {
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
	
	public Node removedup(Node head) {
		Node temp = head;
		while(temp != null && temp.next != null) {
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		return head;
	}
	
	public void print(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		RemoveDuplicate obj = new RemoveDuplicate();
		obj.addToEnd(1);
		obj.addToEnd(1);
		obj.addToEnd(2);
		obj.addToEnd(3);
		obj.addToEnd(4);
		obj.removedup(obj.head);
		obj.print(obj.head);
	}
}
