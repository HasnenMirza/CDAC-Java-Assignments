package linkedlist.util;

public class LinkedList <T> {
	
	Node <T> current;
	Node <T> start;
	Node <T> end;
	
	int count = 0;
	
	public void add(T data){
		Node<T> tempNode = new Node<T>(data);
		
		if(start == null) {
			start = current = end = tempNode;
		}
		else if(start != end) {
			end.next = tempNode;
			tempNode.previous = end;
			end = tempNode;
		}
		count++;
	}
	
	public void delete(int index){
		
		if(start == null || index > count - 1) {
			return;
		}
		
		else if(start == end) {
			start = end = current = null;
		}
		
		else if(index == 0) {
			start = start.next;
			start.previous = null;
			current = start;
		}
		
		else if(index == count - 1) {
			end = end.previous;
			end.next = null;
			current = start;
		}
		
		else {
			
			Node<T> tempNode = start;
			for(int itemp = 0; itemp < index; itemp++) {
				tempNode = tempNode.next;
			}
			tempNode.previous.next = tempNode.next;
			tempNode.next.previous = tempNode.previous;
			
		}
		count--;
	}

	public T getFirst() {
		if(start == null) {
			return null;
		}
		current = start;
		return current.data;
	}
	
	public T getLast() {
		if(end == null) {
			return null;
		}
		
		current = end;
		return current.data;
	}
	
	public T getNext() {
		
		if(start == null || current.next == null) {
			return null;
		}
		
		return current.next.data;
	}
	
	public T getPrevious() {
		
		if(start == null || current.previous == null) {
			return null;
		}
		
		return current.previous.data;
	}

	// ================= ADDED METHODS =================

	// Returns the current size of the list
	public int size() {
		return count;
	}

	// Checks if the list is empty
	public boolean isEmpty() {
		return count == 0;
	}

	// Retrieves data at a specific 0-based index
	public T get(int index) {
		if (start == null || index < 0 || index >= count) {
			return null;
		}
		
		Node<T> tempNode = start;
		for (int itemp = 0; itemp < index; itemp++) {
			tempNode = tempNode.next;
		}
		
		current = tempNode;
		return tempNode.data;
	}
}