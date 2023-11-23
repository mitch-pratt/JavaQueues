package practical_3;

/**
 * This class is for completion in Practical 3iii
 * The Node class is supplied for you
*/
public class NodeQueue<E> implements QueueADT<E>
{
    // references to the head and tail of 
    // the linked list
    protected Node<E> head, tail;   
    // number of elements in the queue
    protected int size;     

    /** constructs an empty queue
    */
    public NodeQueue() {    
       head = null; tail = null;
       size = 0;
    }
    
   // Complete the method bodies below. Take care
   // that exceptions of the correct types are thrown by 
   // your methods as specified in the method comments.
   
    public int size() {
    	return size;
    }
    
    public boolean isEmpty() {
    	if(head == null) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public void enqueue(E elem) {
    // create and link in a new node at tail
    	Node<E> node = new Node<E>(elem, null);
    	
    	if(isEmpty()){
    		
    		head = node;
    		tail = node;
    	}
    		else {
    		
    		tail.setNext(node);
    		tail = node;
    		
    	}
    	
    	size++;
    }

    /**
     @throws EmptyQueueException
    */
    public E front() {
    	if(isEmpty()) {
    		throw new EmptyQueueException("Queue is empty");
    	} else {
    		return head.getElement();
    	}
    }

    /**
     @throws EmptyQueueException
    */
    public E dequeue() {
    	if(isEmpty()) {
    		throw new EmptyQueueException("Queue is empty");
    	} else {
    		E temp = head.getElement();
    		head = head.getNext();
    		
    		if(isEmpty()) {
    			tail = null;
    		}
    		size--;
    		return temp;
    	}
    		
    	
  
    }
    
}
