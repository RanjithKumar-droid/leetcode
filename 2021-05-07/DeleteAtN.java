package linkedlist;

public class DeleteAtN {
	
	class Node{
		int data;
		Node next;
		Node(int val){
			this.data = val;
			
		}
	}
	Node head = null;
	
	public Node addtoEnd(int inp_data) {
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
	

	public Node removeNthFromEnd(Node head, int n) {
		
//		int len = 0;
//		Node temp = head;
//		
//		if(head == null) {
//			return null;
//		}
//		
//		while(temp.next != null) {
//			len++;
//		}
//		System.out.println(len);
//		
//		if(len == 1 && n == 1) {
//			return null;
//		}
//		
//		if(len == n) {
//			head = head.next;
//			return head;
//		}
//		
//		int diff = len - n;
//		temp = head;
//		for(int i=1; i<diff; i++) {
//			temp = temp.next;
//		}
//		
//		temp.next = temp.next.next;
//		return head;
		
		if(head == null) return null;
        Node temp = head;
        int len = 0;
         
        while(temp != null){
            temp = temp.next;
            len++;
        }
        if(len == n){
             head = head.next;
             return head;
        }
        int diff = len - n;
        if(len == 1 && n == 1) return null;
        temp = head;
        for(int i=1; i<diff; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
	}
	
	void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		DeleteAtN obj = new DeleteAtN(); 
		
		obj.addtoEnd(1);
		obj.addtoEnd(2);
		obj.addtoEnd(3);
		obj.addtoEnd(4);
		obj.addtoEnd(5);
		obj.addtoEnd(6);
		obj.print(obj.head);
		obj.removeNthFromEnd(obj.head,3);
		obj.print(obj.head);
	}
}
