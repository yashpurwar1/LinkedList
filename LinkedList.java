package linkedList;

public class LinkedList {
	MyNode head;

	public void insert(int data) {
		MyNode node = new MyNode();
		node.data=data;
		node.next=null;
		if (head == null) {
			head = node;
		}
		else {
			MyNode n = head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data) {
		MyNode node = new MyNode();
		node.data=data;
		node.next=null;
		node.next=head;
		head = node;
	}
	
	public void popFirst() {
		MyNode node = head;
		head = node.next;
	}
	
	public void popAt(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			MyNode n = head;
			MyNode n1 = null;
			for (int i=0; i<index-1; i++) {
				n=n.next;
			}
			n1 = n.next;
			n.next=n1.next;
		}
	}
	
	public void insertAt(int index,int data) {
		MyNode node = new MyNode();
		node.data=data;
		node.next=null;
		MyNode n = head;
		for (int i=0; i<index-1; i++) {
			n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
	
	public void findNode(int data) {
		MyNode node = new MyNode();
		node= head;
		while (node.data != data ) {
			node=node.next;
		}
		System.out.println(node.data +" "+ node.next);
		/// here we will get the node with value data
	}
	
	public void show() {
		MyNode node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
}
