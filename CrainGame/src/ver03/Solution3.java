package ver03;

import java.util.Scanner;
import java.util.Stack;

public class Solution3 {
	
	
	public static int soulution(int [][] board,int[] moves)
	{
		int answer=0; // 인형 개수 
		
		Stack<Integer> s=new Stack<Integer>();
		
		
		
		return answer;
	}

	public static void main(String[] args) {
	
	
		//인형을 담을 보드 5x5 배열
		int[][] board=new int[5][5];
		
		//크레인이 이동하는 위치 담을 배열 
		int[] moves=new int[5]; //1000으로 바꾸기 
		
		int dollCount=0;
		
		Scanner sc=new Scanner(System.in);
		
		//인형을 보드에 담음
		for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    		int doll = (int)(Math.random()*101); 
	    			board[i][j]=doll;//인형의 종류를 담음
	    		  	System.out.print(board[i][j] +" "); 
		    	}System.out.println("\t");
	    }
		
		for(int k=0;k<moves.length;k++) {
		System.out.println("이동할 위치 선택 1~5");
			int location=sc.nextInt();
			sc.nextLine();
			moves[k]=location;
		}
	
		
		//함수 호출
		dollCount = soulution(board,moves);
		
		System.out.println(dollCount);
		
		
	}

}
