package ver03;

import java.util.Scanner;
import java.util.Stack;

public class Solution3 {
	
	
	public static int soulution(int [][] board,int[] moves)
	{
		int answer=0; // 인형 개수 
		
		Stack<Integer> sBucket=new Stack<Integer>();
		
		for(int i=0;i<moves.length;i++) { //열 변화
			
			for( int j=0;j<board.length;j++) { //행 변화 
				
				if(board[j][moves[i]-1] !=00) { //이동한 위치에 인형이 있을 때 
					
					if(sBucket.isEmpty()) {
						sBucket.push(board[j][moves[i]-1]); //현위치의 인형 종류 저장
					}else {
						if(sBucket.peek()==board[j][moves[i]-1]) { //맨 마지막 넣은 인형 종류가 현재 인형 종류와 같을 때
							sBucket.pop(); //같은 인형 종류 이므로 삭제
//							answer=+2;
						}else{
							sBucket.push(board[j][moves[i]-1]);
							answer=+1;
						}
					}
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
		
		Scanner sc=new Scanner(System.in);
		
		//인형을 보드에 담음
		for(int i=0;i<board.length;i++) {
	    	for(int j=0;j<board[i].length;j++) {
	    		int doll = (int)(Math.random()*101); 
	    		
	    		if(doll == 0) {
	    			board[i][j]=00; //인형이 없을 떄 
	    		} else {  		
	    			board[i][j]=doll;//인형의 종류를 담음
	    		}
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
