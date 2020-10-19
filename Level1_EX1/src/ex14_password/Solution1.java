package ex14_password;

public class Solution1 {

	public static String solution(String s, int n) {
		String answer = "";

		char st = ' ';
		int num;

		for(int i=0;i<s.length();i++) {
			
			 st = s.charAt(i);
			 
			 if(Character.isLowerCase(st)) { //소문자 일 때
				 st = (char)(st+n);
				 if(st >= 'z') {
					 st = (char)(st - 26);
				 }
				 
			 } else if(Character.isUpperCase(st)) { //대문자 일 때
				 st = (char)(st+n);
				 if(st >= 'Z') {
					 st = (char)(st - 26);
				 }
			 }
			 
			 answer += st;
		}
		
		System.out.println(answer);
		
		
		return answer;
	}
	
	

	public static void main(String[] args) {
		
		String s="a B z";
		
		int n = 4;
		
		solution(s, n);
		
		
	}

}
