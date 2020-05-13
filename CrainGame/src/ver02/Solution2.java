package ver02;

import java.util.Scanner;

public class Solution2 {
	

	  public static int board[][]=new int[5][5]; // ?¸?˜•?´ ?‹´ê¸? ë³´ë“œ
	
	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	  }

    
    
	public static void main(String[] args) {
		

//		  int board[][]=new int[5][5]; // ?¸?˜•?´ ?‹´ê¸? ë³´ë“œ
		  int moves[]=new int [10];//?¬? ˆ?¸ ??ì§? ?¼ ?ˆ˜ ?ˆ?Š” ?ˆ˜ 1000 ?´?ƒ 

	    
	    //?¸?˜•?˜ ì¢…ë¥˜?Š” 100ê°? 
		  int doll=0;
	    
	    //?¬? ˆ?¸ ??ì§ì´?Š” ?œ„ì¹? ?…? ¥ ???¥ ë³??ˆ˜ 
	    int crain=0;
	    
	    Scanner sc=new Scanner(System.in);

	    //ë§ˆì?ë§? ?¸?±?Š¤ ???¥ 
	    int top=0;
	    
	    //ë³´ë“œ?— ?¸?˜• ?„£ê¸? 
	    for(int i=0;i<board.length;i++) {
	    	
	    	for(int j=0;j<board[i].length;j++) {
	    		  doll = (int)(Math.random()*101); //?œ?¤ ?•¨?ˆ˜ 0~100 
	    			board[i][j]=doll;
	    		  	System.out.print(board[i][j] +" "); //ë°°ì—´?˜ ?œ?¤ ê°? ì¶œë ¥
	    		  	top=j;
		    	}System.out.println("\t");
	    }
	    
	    
	    
	    

	}

}
