package ver02;

import java.util.Scanner;

public class Solution2 {
	

	  public static int board[][]=new int[5][5]; // ?��?��?�� ?���? 보드
	
	 public static int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        return answer;
	  }

    
    
	public static void main(String[] args) {
		

//		  int board[][]=new int[5][5]; // ?��?��?�� ?���? 보드
		  int moves[]=new int [10];//?��?��?�� ??�? ?�� ?�� ?��?�� ?�� 1000 ?��?�� 

	    
	    //?��?��?�� 종류?�� 100�? 
		  int doll=0;
	    
	    //?��?��?�� ??직이?�� ?���? ?��?�� ???�� �??�� 
	    int crain=0;
	    
	    Scanner sc=new Scanner(System.in);

	    //마�?�? ?��?��?�� ???�� 
	    int top=0;
	    
	    //보드?�� ?��?�� ?���? 
	    for(int i=0;i<board.length;i++) {
	    	
	    	for(int j=0;j<board[i].length;j++) {
	    		  doll = (int)(Math.random()*101); //?��?�� ?��?�� 0~100 
	    			board[i][j]=doll;
	    		  	System.out.print(board[i][j] +" "); //배열?�� ?��?�� �? 출력
	    		  	top=j;
		    	}System.out.println("\t");
	    }
	    
	    
	    
	    

	}

}
