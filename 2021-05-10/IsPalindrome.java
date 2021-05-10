// https://leetcode.com/explore/learn/card/linked-list/219/classic-problems/1209/

package linkedlist;
import java.util.*;

import linkedlist.OddEven.Node;
public class IsPalindrome {

	class Node {
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
	
	
	public boolean isPalin(Node head) {
		Stack<Integer> stk = new Stack<Integer>();
		Node slow = head;
		boolean ispalin = true;
		while(slow != null) {
			stk.push(slow.data);
			slow = slow.next;
		}
		
		while(head != null) {
			int i = stk.pop();
			if(i == head.data) {
				ispalin = true;
			}else {
				ispalin = false;
				break;
			}
			head = head.next;
		}
		System.out.println(ispalin);
		return ispalin;
	}
	
	public void print(Node head) {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		
		IsPalindrome obj = new IsPalindrome();
		obj.addToEnd(1);
		obj.addToEnd(2);
		obj.addToEnd(1);
		obj.addToEnd(1);
		obj.isPalin(obj.head);
		obj.print(obj.head);
		
	}
}
