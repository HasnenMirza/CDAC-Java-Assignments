package linkedlist.util;

import java.io.Serializable;

public class Node<T> implements Serializable {
	
	T data;
	Node<T> next;
	Node<T> previous;
	
	Node(T data){
		this.data=data;
	}

}
