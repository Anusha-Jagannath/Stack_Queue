package com.list;

public class StackQueueMain {

	public static void main(String[] args) {

		System.out.println("welcome to Stack and Queue program");
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.peak();
		stack.pop();
		stack.print();
		stack.size();
		Queue queue = new Queue();
		queue.enqueue(70);
		queue.enqueue(30);
		queue.enqueue(56);
		queue.printQueue();
		queue.size();
		queue.dequeue();
		queue.printQueue();
	}

}
