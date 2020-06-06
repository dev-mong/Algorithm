package ex7_string;

public class Solution1 {
	
	
	public static boolean solution(String s) {
		
		boolean answer=true;
		if(s.length() ==4 || s.length()==6)
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) <'0' || s.charAt(i)>'9') {
					answer=false;
				}
			}	
		
	
		return answer;
        
	}

	public static void main(String[] args) {

		String s="a234";
		boolean answer=solution(s);
		System.out.println(answer);
	}

}
