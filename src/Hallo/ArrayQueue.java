package Hallo;

import java.util.EmptyStackException;

public final class ArrayQueue<T> {
	
	private T[] queue;
	private int frontIndex;
	private int backIndex;
	private boolean initialized = false;
	
	// Creates a queue with the desired capacity.
	public ArrayQueue(int setCapacity){
		
		checkCapacity(setCapacity);
			
		@SuppressWarnings("unchecked")
		T[] tempQueue = (T[]) new Object[setCapacity + 1];
		queue = tempQueue;
		frontIndex = 0;
		backIndex = setCapacity;
		initialized = true;
		
	} // end constructor
	
	// If a queue capacity is not specified
	// Creates a queue with the default capacity.
	public ArrayQueue() {
		
		this(3);
		
	} // end default constructor
	
	// Adds a new entry to the front of the queue.
	public void enqueue(T newEntry) {
		
		checkInitialized();
		ensureCapacity();
		
		backIndex = (backIndex + 1) % queue.length;
		queue[backIndex] = newEntry;
		
	} // end enqueue
	
	// Removes and returns the front entry in the queue.
	public T dequeue() {
		
		checkInitialized();
		
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			T front = queue[frontIndex];
			queue[frontIndex] = null;
			frontIndex = (frontIndex + 1) % queue.length; // Index of new front of queue
			return front;	
		}
		
	} // end dequeue
	
	// Checks if the queue is empty.
	public boolean isEmpty() {
		
		return frontIndex == ((backIndex + 1) % queue.length);
		
	} // end isEmpty
	
	// Checks if the queue has been created.
	private void checkInitialized() {
		
		if(!initialized) {
			throw new SecurityException("The queue has not been created.");
		}
		
	} // end checkInitialized
	
	// Checks the set capacity of the queue.
	// If the queue exceeds the maximum capacity, an exception is thrown.
	private void checkCapacity(int capacity) {
		
		if (capacity > 10000) {
			throw new IllegalStateException("The queue exceeds the maximum capacity [" +
											10000 + "] .");
		}
		
	} // end checkCapacity
	
	// Checks if the queue if full.
	// If the queue is full, the size of the queue is doubled.
	private void ensureCapacity() {
		
		if (frontIndex == ((backIndex + 2) % queue.length)) {
			T[] oldQueue = queue;
			int oldSize = oldQueue.length;
			int newSize = oldSize + 5;
			checkCapacity(newSize - 1);
			
			@SuppressWarnings("unchecked")
			T[] tempQueue = (T[]) new Object[newSize];
			queue = tempQueue;
			
			for (int index = 0; index < oldSize - 1; index++) {
				queue[index] = oldQueue[frontIndex];
				frontIndex = (frontIndex + 1) % oldSize;	
			}
			
			frontIndex = 0;
			backIndex = oldSize - 2;	
		}
		
	} // end ensureCapacity

} // end ArrayQueue
