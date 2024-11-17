/**
 * A sortable DoublyLinkedList.  The fields and the DLLNode class in the
 * COMP232DoublyLinkedList class are protected fields and can be accessed
 * directly in this class.
 * 
 * @author William Goble
 * @author Dickinson College
 * 
 */
public class COMP232SortableLinkedList<E extends Comparable<E>> extends COMP232DoublyLinkedList<E> {

	/**
	 * Implementation of insertion sort for the LinkedList. The elements of the
	 * list will be sorted according to the order imposed by their compareTo
	 * method.
	 */
	public void insertionSortList() {
		DLLNode<E> temp = head.next.next;
		while(temp != tail){
			E value = temp.element;
			DLLNode<E> pos = temp.prev;
			while(pos != head){
				if(pos.element.compareTo(value) > 0){
					pos.next.element = pos.element;
					pos = pos.prev;
				}else{
					break;
				}
			}
			pos.next.element = value;
			temp = temp.next;
		}

	}
}

