package ver01;

import java.util.Scanner;
import java.util.Stack;

public class Solution {


	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	    }
	

	
	public static void main(String[] args) {

		int board[][]=new int[5][5]; // ?��?��?�� ?���? 보드
		int moves[]=new int [10];//?��?��?�� ??�? ?�� ?�� ?��?�� ?�� 1000 ?��?�� 
		  

	    
	    //?��?��?�� 종류?�� 100�? 
	    int doll=0; 
	    
	    //?��?��?�� ??직이?�� ?���? ?��?�� ???�� �??�� 
	    int crain=0;
	    
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=0;i<board.length;i++) {
	    	for(int j=0;j<board[i].length;j++) {
      		    doll = (int)(Math.random()*101); //?��?�� ?��?�� 0~100 
    			board[i][j]=doll;
    		  	System.out.print(board[i][j] +" "); //배열?�� ?��?�� �? 출력
	    	}System.out.println("\t");
	    }
	    
	    //?��?��?�� 1000�? ?��?�� 
	    for(int m=0;m<moves.length;m++) {
	     	System.out.println("?��?��?��?�� ??직일 ?��치�?? ?��?��?��?��?��. 1~5?��?��?�� ?��?��"); //?��?��처리 ?���? ------
	    	crain =sc.nextInt();
	    	sc.nextLine();
	    	moves[m]=crain-1;
	    }  	
	    System.out.print("[");
	    for(int k=0;k<moves.length;k++) {
	    System.out.print(moves[k]+",");
	    }System.out.print("]");

	    solution(board,moves);
	    
	}

}
