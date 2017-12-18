/**
 * 
 */
package algorithms.easy;

import java.util.Stack;

/**
 * @author mamamiyear
 * @date 2015年10月26日
 * 
 * Implement the following operations of a queue using stacks.
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * 
 * Notes:
 * You must use only standard operations of a stack -- 
 * which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. 
 * You may simulate a stack by using a list or deque (double-ended queue), 
 * as long as you use only standard operations of a stack.
 * You may assume that all operations are valid 
 * (for example, no pop or peek operations will be called on an empty queue).
 */
public class ImplementQueueUsingStacks {
	
	public class MyQueue {
		Stack<Integer> inStack = new Stack<Integer>();
		Stack<Integer> outStack = new Stack<Integer>();
		
	    // Push element x to the back of queue.
	    public void push(int x) {
	        inStack.push(x);
	    }

	    // Removes the element from in front of queue.
	    public void pop() {
	        if(outStack.isEmpty()) {
	        	moveInToOut();
	        }
	        outStack.pop();
	    }

	    // Get the front element.
	    public int peek() {
	    	if(outStack.isEmpty()) {
	        	moveInToOut();
	        }
	        return outStack.peek();
	    }

	    // Return whether the queue is empty.
	    public boolean empty() {
	        return inStack.isEmpty() && outStack.isEmpty();
	    }
	    
	    private void moveInToOut() {
	    	while(!inStack.isEmpty()) {
	    		int temp = inStack.pop();
	    		outStack.push(temp);
	    	}
	    }
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	}

}
