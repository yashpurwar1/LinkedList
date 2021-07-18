package linkedList;

public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(56);
		list.insert(30);
		list.insert(70);
		list.findNode(30);
		list.findNodePushData(30, 40);

		list.show();
	}

}
