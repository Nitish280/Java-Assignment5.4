import java.util.Stack;

/**
 *  here we are creating an application 
 *  for Stack operations push, pop, peek without using collections.
 */
//here we are Creating class Stack Test
public class Stacktest { 
	public static void main(String args[]) {
		// here we are creating a stack 
		Stack<String> st = new Stack<String>();
		// Stack follows Last-In-First out approach
		// here we are applying Push operation 
		
		st.push("Nitish");  // Inserting element in the stack at the bottom 
		st.push("Vishwas"); // Inserting element in the stack at second position
		st.push("Vikash"); // Inserting element in the stack at third position
		st.push("vishal");  // Inserting element at the top 
		System.out.println("Stack after PUSH operation: " + st);
		//Peek operation which returns  
        // the value of the top  
		// here we are checking the top element and prints it
        System.out.println("\nElement at the top is: " + st.peek()); 
                                                                      
		                                                            
        //here we are applying Pop operation
		st.pop(); //Deleting element from the top 
		st.pop(); //Deleting element from second position
		st.pop(); //Deleting element from third position
		st.pop(); //Deleting element from the bottom
		//Printing empty stack after deleting all elements
		System.out.println("\nStack is empty" + st);
		                                                
		                                            
		

	}



}

