package ex7_string;

public class Solution1 {
	
	
	public static boolean solution(String s) {
		
		
		if(s.length()<4 || s.length()>6) {
			
			for(int i=0;i<s.length();i++) {
				if( 48>s.charAt(i) || s.charAt(i)>57) {

				System.out.println(s.charAt(i));
			} 
			return false;
	
			}
		}
		return true;
        
	}

	public static void main(String[] args) {

		String s="abc";
		boolean answer=solution(s);
		System.out.println(answer);
	}

}
