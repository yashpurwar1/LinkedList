package linkedList;

public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(56);
		list.insert(70);
		list.insertAt(1, 30);
		list.popFirst();

		list.show();
	}

}
