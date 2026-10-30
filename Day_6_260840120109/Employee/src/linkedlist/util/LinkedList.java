package linkedlist.util;

public class LinkedList<T> implements ReadInList<T>,WriteInList<T> {
	
	Node <T> current;
	Node <T> start;
	Node <T> end;
	
	int count = 0;
	
	
	public void add(T data)
	{
		Node<T> tempNode = new Node<T>(data);
		
		if(start == null) {
			start = current = end = tempNode;
		}
		else {
			end.next = tempNode;
			tempNode.previous = end;
			end = tempNode;
		}
		count++;
	}
	
	public void delete(int index) throws LinkedListException{
		
		if(start == null || index > count - 1) {
			throw new LinkedListException("Empty List! No record found!");
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

	public T getFirst() throws LinkedListException {
		if(start == null) {
			throw new LinkedListException("Empty List! No record found!");
		}
		current = start;
		return current.data;
	}
	
	public T getLast() throws LinkedListException {
		if(end == null) {
			throw new LinkedListException("Empty List! No record found!");		
			}
		
		current = end;
		return current.data;
	}
	
	public T getNext() throws LinkedListException {
		
		if(start == null || current.next == null) {
			
		throw new LinkedListException("Empty List! No record found!");			}
		current=current.next;
		return current.data;
	}
	
	public T getPrevious() throws LinkedListException {
		
		if(start == null || current.previous == null) {
		throw new LinkedListException("Empty List! No record found!");			}
		
		current=current.previous;
		return current.data;
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