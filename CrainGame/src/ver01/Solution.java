package ver01;

import java.util.Scanner;
import java.util.Stack;

public class Solution {


	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	    }
	

	
	public static void main(String[] args) {

		int board[][]=new int[5][5]; // ?Έ??΄ ?΄κΈ? λ³΄λ
		int moves[]=new int [10];//?¬? ?Έ ??μ§? ?Ό ? ?? ? 1000 ?΄? 
		  

	    
	    //?Έ?? μ’λ₯? 100κ°? 
	    int doll=0; 
	    
	    //?¬? ?Έ ??μ§μ΄? ?μΉ? ?? ₯ ???₯ λ³?? 
	    int crain=0;
	    
	    Scanner sc=new Scanner(System.in);
	    
	    for(int i=0;i<board.length;i++) {
	    	for(int j=0;j<board[i].length;j++) {
      		    doll = (int)(Math.random()*101); //??€ ?¨? 0~100 
    			board[i][j]=doll;
    		  	System.out.print(board[i][j] +" "); //λ°°μ΄? ??€ κ°? μΆλ ₯
	    	}System.out.println("\t");
	    }
	    
	    //?¬? ?Έ 1000λ²? ?΄? 
	    for(int m=0;m<moves.length;m++) {
	     	System.out.println("?¬? ?Έ? ??μ§μΌ ?μΉλ?? ?? ₯??Έ?. 1~5?¬?΄? ?? ₯"); //??Έμ²λ¦¬ ?κΈ? ------
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
