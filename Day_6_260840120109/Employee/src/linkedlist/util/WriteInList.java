package linkedlist.util;

public interface WriteInList<T>  {

	void add(T data);
	void delete(int index) throws LinkedListException;
	
}
