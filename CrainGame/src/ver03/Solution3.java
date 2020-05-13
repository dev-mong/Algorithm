package ver03;

import java.util.Scanner;
import java.util.Stack;

public class Solution3 {
	
	
	public static int soulution(int [][] board,int[] moves)
	{
		int answer=0; // 인형 개수 
		
		Stack<Integer> s=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		Stack<Integer> s3=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		
		board[0][0]=s.push(0);
		board[0][1]=s.push(1);
		board[0][2]=s.push(2);
		
		board[1][0]=s.push(0);
		board[1][1]=s.push(1);
		board[1][2]=s.push(4);
		
		board[2][0]=s.push(2);
		board[2][1]=s.push(5);
		board[2][2]=s.push(3);
		
		
		
		//인형을 보드에 담음
//		int j=0;
		for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
////	    		int doll = (int)(Math.random()*101); 
//	    			board[i][j]=s;//인형의 종류를 담음
	    		  	System.out.print(board[i][j] +" "); 
		    	}System.out.println("\t");
//		    	System.out.println(s);
	    }

		
		for(int k=0;k<3;k++) { //행을 뽑음 - 크레인 위치 이동
		System.out.println("크레인을 이동 할 위치를 입력하세요. 1~5사이로 입력 ");
		moves[k]=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<3;i++) {
				if(board[moves[k]-1][i]==s.peek()) { //인형이 이동한 위치의 마지막 데이터 값 비교 
					System.out.println(s.peek());
					answer+=1;
					s.pop();
				}
		
			}
				
			}
		
		return answer;
	}

	public static void main(String[] args) {
	
	
		//인형을 담을 보드 5x5 배열
		int[][] board=new int[5][5];
		
		//크레인이 이동하는 위치 담을 배열 
		int[] moves=new int[5]; //1000으로 바꾸기 
		
		int dollCount=0;
		//함수 호출
		dollCount = soulution(board,moves);
		
		System.out.println(dollCount);
		
		
	}

}
