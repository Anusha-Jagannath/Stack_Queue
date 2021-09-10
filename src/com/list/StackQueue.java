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
}

class StackQueue {

	public static void main(String[] args) {
		System.out.println("welcome to Stack and Queue program");
		LinkedList list = new LinkedList();
		list.push(70);
		list.push(30);
		list.push(56);
		list.print();
		
	}
}
