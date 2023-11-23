package practical_3;

/**
 * This class is for completion in practical 3 part i
*/
public class ArrayQueue<E> implements QueueADT<E>
{
   protected E[] Q; // Q will refer to the array
   protected int f; // front - array index of element at front of queue
   protected int r; // rear - array index of where next element added will be placed 
   protected int N;  // array capacity

   /**
    * Constructor for objects of class ArrayQueue.
    * In practical 3i no change need be made to this constructor.
    * With this constructor a queue can hold up to 3 (i.e.N-1) items when 
    * using the approach described in lectures.
    */
   public ArrayQueue()
   {
       N=4;
       Q = (E[]) new Object[N]; 
       f=0;
       r=0;
   }
    
   // In practical 3i complete the methods below using an array 
   // implementation where the queue is considered full if the 
   // queue size is one less than the array capacity. Pseudo code
   // is provided in MyPlace Activity 4.10 slides 7 and 8.
   // Take care that exceptions of the correct types are 
   // thrown by your methods as specified in the method comments.
   
   /** 
     @throws FullQueueException
   */
   public void enqueue(E element){
	   if(size() == N-1)
		   throw new FullQueueException("Queue full, cannot enqueue.");
	   else {
		   Q[r] = element;
		   r = (r + 1) % N;
	   }
	   
   }

   /**
     @throws EmptyQueueException
   */
   public E dequeue(){
	   E element;
	     if (isEmpty())
	        throw new EmptyQueueException("Queue is empty. Cannot dequeue.");
	     element = Q[f];
	     f = (f + 1) % N;
	     return element;
   }
   
   /**
     @throws EmptyQueueException
   */
   public E front(){
	   if(isEmpty())
		   throw new EmptyQueueException("Queue is empty. Nothing to return");
	   return Q[f];
   }

   public int size(){
	   return (N-f+r) % N;
   }

   public boolean isEmpty(){
	   if(f == r) {
		   return true;
	   } else {
		   return false;
	   }
   		}
	   
   }  

