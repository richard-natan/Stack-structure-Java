
public class Stack {

	private Node top;

	public void pushOnTop(String value) {
		Node newNode = new Node();
		newNode.setValue(value);
		newNode.setNextNode(this.top);
		this.top = newNode;
	}

	public void removeFromTop() {
		this.top = top.getNextNode();
	}

	public String getValueOnTop() {
		return this.top.getValue();
	}

	public boolean isEmpty() {

		if (this.top == null) {
			return true;
		}

		return false;
	}

	public void printStack() {
		Node tempNode = this.top;

		if (isEmpty()) {
			System.out.println("Stack Empty!");
		} else {
			while (tempNode != null) {
				System.out.printf("| %s |\n", tempNode.getValue());
				tempNode = tempNode.getNextNode();
			}
		}
	}
}
