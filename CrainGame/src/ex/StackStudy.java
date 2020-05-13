package ex;

import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {

		Stack<Integer> s=new Stack<Integer>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		int num=s.pop();
		System.out.println(num);
		
	}

}
