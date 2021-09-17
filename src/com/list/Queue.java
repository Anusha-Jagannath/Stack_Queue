package com.list;

public class Queue {

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
	 * method to insert data to queue
	 * 
	 * @param data, here data is inserted at rear end
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
	 * method to delete data from the beginning in queue here data is deleted from
	 * front end
	 */

	public void dequeue() {
		Node temp = head;
		if (head == null) {
			System.out.println("Queue is empty");
			return;
		} else if (head.next == null) {
			temp = null;

		} else {
			head = head.next;
			temp = null;
		}
	}

	/*
	 * method to find size of the Queue if queue has one element this method prints
	 * size as 1 else traverses till list is empty and increments size
	 */
	public void size() {
		int size = 0;
		Node temp = head;
		if (head.next == null) {
			size = 1;
		} else {
			while (temp != null) {
				temp = temp.next;
				size++;
			}
			System.out.println("Size of Queue is " + size);
		}
	}

	/*
	 * method to display queue contents
	 */
	public void printQueue() {
		Node temp = head;
		System.out.println("\nQueue elements are");
		while (temp.next != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
