public class MyLinkedList<E> extends MyAbstractList<E>{
	private Node<E> head,tail;
	
	/** Create a default list. */
	public MyLinkedList(){}
	
	/** Create a list from an array of objects. */
	public MyLinkedList(E[] objects){
		super(objects);
	}
	
	/** Return the head element in the list. */
	public E getFirst(){
		if (size == 0)
			return null;
		else
			return head.element;
	}
	
	/** Return the last element in the list. */
	public E getLast(){
		if (size == 0)
			return null;
		else
			return tail.element;
	}
	
	/** Add an element to the beginning of the list. *//
	public void addFirst(E e){
		Node<E> newNode=new Node<E>(e);
		newNode.next=head;
		head=newNOde;
		size++;
		
		if(tail==null)
			tail=head;
	}
	
	/** Add an element to the end of the list. */
	public void addLast(E e){
		Node<E> newNode = new Node<E>(e);
		if (tail == null){
			head = tail = newNode;
		}
		else{
			tail.next = newNode;
			tail = tail.next;
		}
		
		size++;
	}
	
	/** Add a new element at the specified index in this list.
	  * The index of the head element is 0. */
	public void add(int index, E e){
		if(index == 0) addFirst(e);
		else if(index >=size) addLast(e);
		else{
			Node<E> current = head;
			for(int i = 1; i<index; i++)
				current = current.next;
			Node<E> temp = current.next;
			current.next = new Node<E>(e);
			(current.next).next = temp;
			size++;
		}
	}
	
	/** Remove the head node and return the object that
	  * is contained in the removed node. */
	public E removeFirst(){
		if (size == 0) return null;
		else{
			Node<E> temp = head;
			head = head.next;
			size--;
			if(head == null) tail = null;
			return temp.element;
		}
	}
	
	/** Remove the last node and return the object that
	  * is contained in the removed node. */
	public E removeLast(){
		if(size == 0) return null;
		else if(size == 1){
			Node<E> temp = head;
			 head = tail = null;
			 size = 0;
			 return temp.element;
		}
		else{Node<E> current = head;
		for(int i = 0; i < size-2; i++)
			current = current.next;
		Node<E> temp = tail;
		tail = current;
		tail.next = null;
		size--;
		return temp.element;
	}
	
	/** Remove the element at the specified position in this list.
	  * Return the element that was removed from the list. */
	 public E remove(int index){
		if(index < 0 || index >= size) return null;
		else if(index == 0) return removeFirst();
		else if(index == size - 1) return removeLast();
		else{
			Node<E> previous = head;
			for(int i = 1; i<index; i++)
				previous = previous.next
			Node<E> current = previous.next;
			previous.next = current.next;
			size--;
			return current.element.
		}
	}
	 
	/** Override toString() to return the elements in the list. */
	public String toString(){
		StringBuilder result = new StringBuilder("[");
		
		Node<E> current = head;
		for(int i = 0; i < size; i++){
			result.append(current.element);
			current = current.next;
			if(current != null)
				result.append(",");
			else
				result.append("]");
		}
		return result.toString();
	}
	
	/**Clear the list. */
	public void clear(){
		head = tail = null;
	}
	
	/** Return true if this list contains the element o. */
	public boolean contains(E e){
		Node<E> current = head;
		for(int i = 0; i < size; i++){
			if(e.equals(current.element)) return true;
			current = current.next;	
		}
		return false;
	
	}
	
	/** Return the element from this list at the specified index. */
	public E get(int index){
		if(index>=size) return null;
		else if(index == 0) return head.element;
		else{
			Node<E> current = head;
			for(int i = 0; i < index; i++)
				current = current.next;
			return current.element;
		}
		
		
	}
	
	/** Return the index of the head matching element in this list.
	  * return -1 if no match. */
	public int indexOf(E e){
		Node<E> current = head;
		for(int i = 0; i < size; i++){
			if(e.equals(current.element)) return i;
			current = current.next;
		}
	}
	
	/** Return the index of the last matching element in this list.
	  * Return -1 if no match. */
	public int lastIndexOf(E e){
		Node<E> current = head;
		int index = -1;
		for(int i = 0; i < size; i++){
			if(e.equals(current.element)) index = i;
			current=current.next;
		}
		return index;
	}
	
	/** Replace the element at the specified position in this list
	  * with the specified element. */
	public E set(int index, E e){
		Node<E> current = head;
		for(int i = 0; i < index; i++)
			current = current.next;
		E temp = current.element;
		current.element = e;
		return temp;
	}
	
	private static class Node<E> {
	E element;
	Node<E> next;
	
	public Node(E e){
		element = e;
	}
}
}