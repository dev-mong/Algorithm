package ver01;

import java.util.Scanner;
import java.util.Stack;

public class Solution {


	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	    }
	

	
	public static void main(String[] args) {

		int board[][]=new int[5][5]; // ?¸?˜•?´ ?‹´ê¸? ë³´ë“œ
		int moves[]=new int [10];//?¬? ˆ?¸ ??ì§? ?¼ ?ˆ˜ ?ˆ?Š” ?ˆ˜ 1000 ?´?ƒ 
		  

	    
	    //?¸?˜•?˜ ì¢…ë¥˜?Š” 100ê°? 
	    int doll=0; 
	    
	    //?¬? ˆ?¸ ??ì§ì´?Š” ?œ„ì¹? ?…? ¥ ???¥ ë³??ˆ˜ 
	    int crain=0;
	    
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=0;i<board.length;i++) {
	    	for(int j=0;j<board[i].length;j++) {
      		    doll = (int)(Math.random()*101); //?œ?¤ ?•¨?ˆ˜ 0~100 
    			board[i][j]=doll;
    		  	System.out.print(board[i][j] +" "); //ë°°ì—´?˜ ?œ?¤ ê°? ì¶œë ¥
	    	}System.out.println("\t");
	    }
	    
	    //?¬? ˆ?¸ 1000ë²? ?´?™ 
	    for(int m=0;m<moves.length;m++) {
	     	System.out.println("?¬? ˆ?¸?„ ??ì§ì¼ ?œ„ì¹˜ë?? ?…? ¥?•˜?„¸?š”. 1~5?‚¬?´?— ?…? ¥"); //?˜ˆ?™¸ì²˜ë¦¬ ?•˜ê¸? ------
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
