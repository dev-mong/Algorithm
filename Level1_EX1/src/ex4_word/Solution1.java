package ex4_word;

public class Solution1 {
	
	  public static String solution(String s) {
	        String answer = "";
			char c=' ';
			for(int i=0;i<s.length();i++) {
				if(i%2==0) {
				c=s.charAt(i);
				c=(char)(c-32);		
				}else {
					c=s.charAt(i);
				}
				answer+=c;
			}
	        
	        return answer;
	    }

	public static void main(String[] args) {
		
		String s="try hello world";
		s=solution(s);
		System.out.println(s);
				
	}

}
