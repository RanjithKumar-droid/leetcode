//      https://leetcode.com/explore/learn/card/linked-list/214/two-pointer-technique/1215/
package linkedlist;
import java.util.LinkedList;
public class Intersection {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int val){
			this.data = val;
			this.next = null;
		}
	}
	static Node head = null;
	
	// Getting the intersected Node
	
	public static Node getIntersection(Node headA, Node headB) {
		
		int lenA = 0;
		int lenB = 0;
		
		Node tempA = headA;
		Node tempB = headB;
		
		while(tempA != null) {
			lenA++;
			tempA = tempA.next;
		}
		
		while(tempB != null) {
			lenB++;
			tempB = tempB.next;
		}
		
		int diff = Math.abs(lenA-lenB);
		
		tempA = headA;
		tempB = headB;
		if(lenA > lenB) {
			while(diff-- > 0) {
				tempA = tempA.next;
			}
		}else {
			tempB = tempB.next;
		}
		while(tempA != tempB) {
			tempA = tempA.next;
			tempB = tempB.next;
			if(tempA == null || tempB == null) return null;
		}
		return tempB;
	}
	
	
	public static void main(String[] args) {
		   Node headA = new Node(4);
		   Cycle2 obj = new Cycle2();
		   obj.addtoEnd(5);
		   Node headB = new Node(2);
		   
	}
}
