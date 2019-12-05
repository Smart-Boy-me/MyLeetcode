package Medium;

class Queue{
	private String string;
	private String[] strings;
	private int front;
	private int rear;
	
	public Queue() {
		strings = new String[100];
		front = rear = 0;
	}

	public void setString(String string) {
		this.string = string;
	}
	
	public String getString() {
		return string;
	}
	
	public void EnQueue(String string) {
		strings[rear++] = string;
	}
	
	public String DeQueue() {
		return strings[front++];
	}
	
	public boolean IsEmpty() {
		return front == rear;
	}
}

public class leetcode_17 {
	
	public static void main(String[] args) {
		
	}

}
