package stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class stackBasicProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(new Integer(1));
		st.push(new Integer(2));

		System.out.println(st.pop());
		System.out.println(st.pop());
		try {
			System.out.println(st.pop());
		} catch (EmptyStackException e) {
			System.err.println("Stack is empty");
		}
	}

}
