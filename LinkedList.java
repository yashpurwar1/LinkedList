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
	public void show() {
		MyNode node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
}
