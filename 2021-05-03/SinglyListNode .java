package linkedlist;

public class SinglyListNode {
	
	// Initialization of data structure 
		class Node{
			int data;
			Node next;
			
			public Node(int val) {
				this.data = val;
			}
		
		}
		
		Node head = null;
		Node tail = null;
		int size = 0;
		
	// Constructor of main class 
		public SinglyListNode() {
			head = new Node(0);
			tail = new Node(0);
			head.next = tail;
		}
		
		public int get(int index) {
			
			if(index == 0 || index >= size)   return -1;
			
			Node temp = head;
			for(int i=0; i<index; i++) {
			 temp = temp.next;
			}
			System.out.println(temp.data);
			return temp.data;
		}
		
		 public void addAtHead(int val) {
			 addAtIndex(0,val);
		    }
		    
		    /** Append a node of value val to the last element of the linked list. */
		    public void addAtTail(int val) {
		    	addAtIndex(size,val);
		    }
		    
		    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
		    public void addAtIndex(int index, int val) {
		        if(index < 0 || index > size) return;
		        
		        Node n = new Node(val);
		        Node temp = head;
		        
		        for(int i=0;i<index;i++){
		            temp = temp.next;
		        }
		        n.next = temp.next;
		        temp.next = n;
		        size++;
		    }
		    
		    /** Delete the index-th node in the linked list, if the index is valid. */
		    public void deleteAtIndex(int index) {
		        
		        if(index < 0 || index >=size) return;
		        
		        Node temp = head;
		        
		        for(int i=0;i<index;i++){
		            temp = temp.next;
		        }
		        temp.next = temp.next.next;
		        size--;
		    }
		    
		public static void main(String[] args) {
			
			SinglyListNode obj = new SinglyListNode();
			obj.addAtHead(2);
			obj.addAtIndex(2, 54);
			obj.addAtTail(3);
			obj.get(1);
			obj.deleteAtIndex(2);
		}
		
}

