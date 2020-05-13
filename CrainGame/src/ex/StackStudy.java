package ex;

import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {

		Stack<Integer> s=new Stack<Integer>();
		
		//데이터 담음
		s.push(1); 
		s.push(2);
		s.push(3);
		
		//데이터 꺼내기 
		int num=s.pop();
		System.out.println(num);
		
	}

}
