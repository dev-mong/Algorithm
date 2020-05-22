package ex2_star;

import java.util.Scanner;

public class Solution1 {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int check(int check) {
		while(true) {
		        try {

		        	if(check>1000) {
		        		 Exception e = new Exception();
		        		 throw e;
		        	 }
		        }catch(Exception e) {
		        	
		        	System.out.println("1000이하인 숫자를 입력하세요.");
		        	check=sc.nextInt(); //숫자 재입력 
		        	sc.nextLine();	
		        	
		        	continue;
		        }
		    
		        return check;
		}
		      
	}


	  public static void main(String[] args) {	  
		  
	        System.out.println("a의 수를 입력하세요.");
	        int a = sc.nextInt();
	    
	        a=check(a);

	        System.out.println("b의 수를 입력하세요.");
	        int b = sc.nextInt();
	     
	        b=check(b);
	       

	        for(int i=0;i<b;i++) {//행
	        	for(int j=0;j<a;j++) {//열
	        		System.out.print("*");
	        	}System.out.println();
	        }
	        System.out.println(a + b);
	        }
		  


}
