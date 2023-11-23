package practical_3;

import java.util.List;
import java.util.ArrayList;
/**
 * This class is for completion in Practical 3iv
*/
public class AdapterQueue<E> implements QueueADT<E>{
	
   protected ArrayList<E> aList;  
   // Note: in above, interface List could instead replace ArrayList
   // but no need to alter the above in this exercise

   public AdapterQueue(){
	aList = new ArrayList<E>();
   }

   // Complete the method bodies below using the adapter pattern,
   // by calling appropriate methods on the field aList. Take care
   // that exceptions of the correct types are thrown by your methods,
   // as specified in the method comments.
   
   public void enqueue(E element) {
	   aList.add(element);
   }

   /**
     @throws EmptyQueueException
   */   
   public E dequeue(){
	   if(aList.isEmpty()) {
		   throw new EmptyQueueException("Queue empty.");
	   }
	   E remove = aList.get(0);
	   aList.remove(aList.get(0));
	   return remove;
   }
	
   /**
     @throws EmptyQueueException
   */
   public E front(){
	   if(aList.isEmpty()) {
		   throw new EmptyQueueException("Queue is empty.");
	   }
	   return aList.get(0);
   }

   public int size() {
	   return (aList.size());
   }

   public boolean isEmpty() {
	   if(aList.size() == 0) {
		   return true;
	   } else {
		   return false;
	   }
   }
}

