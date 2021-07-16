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
	
	public void show() {
		MyNode node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
}
