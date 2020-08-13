
public class Stack {
	final int size=1000;
	int top=-1;
	int[] array = new int[size];
	public void push(int element) {
		if(top>size) {
			System.out.println("Stack is Full");
		}
		else {
			array[++top] = element;
			System.out.println("Pushed "+element+" into the stack");
		}
	}
	public int pop() {
		if(top<0) {
			 isEmpty();
		}
		else {
			int del = array[top--];
			return del;
		}
		return 1;
	}
	public void isEmpty() {
		if(top<0) {
			System.out.println("Stack is empty");
		}
	}
	public void peek() {
		if(top<0) {
			 isEmpty();
		}
		else {
			int peek = array[top];
			System.out.println("Top element is : "+peek);
		}
	}
	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.pop();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.peek();
		System.out.println(obj.pop() +" is popped");
		obj.peek();
	}
}
