package com.list;

class LinkedList {

	private Node head;

	private class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	/*
	 * method to insert data at the end
	 * 
	 * @param data
	 */
	public boolean push(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}

	/*
	 * method to pop data from stack
	 */

	public void pop() {
		Node temp = head;
		Node cur = temp;
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		} else if (head.next == null) {
			temp = null;
			System.out.println("Deleted " + head.data);

		} else {
			while (temp.next != null) {
				cur = temp;
				temp = temp.next;
			}
			System.out.println("Deleted " + temp.data);
			cur.next = null;
		}
	}
	/*
	 * method to find top most element in the stack
	 */

	public void peak() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			System.out.println("peak element is " + temp.data);
		}
	}

	/*
	 * method to display stack contents
	 */
	public void print() {
		Node temp = head;
		System.out.println("\nStack elements are");
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
	
	/*
	 * method to insert data to queue
	 * 
	 * @param data
	 */
	public boolean enqueue(final int data) {
		boolean isAdded = false;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			isAdded = true;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			isAdded = true;
		}
		return isAdded;
	}
	
	/*
	 * method to display queue contents
	 */
	public void printQueue() {
		Node temp = head;
		System.out.println("\nQueue elements are");
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
}

class StackQueue {

	public static void main(String[] args) {
		System.out.println("welcome to Stack and Queue program");
		LinkedList list = new LinkedList();
		list.enqueue(70);
		list.enqueue(30);
		list.enqueue(56);
		list.printQueue();

	}
}
