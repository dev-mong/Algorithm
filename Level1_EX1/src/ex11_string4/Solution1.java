package ex11_string4;

public class Solution1 {

	static boolean solution(String s) {
        boolean answer = true;
        char check=s.charAt(0);
       
        int count;
        for(int i=1;i<s.length();i++) {
   
        	if(check>s.charAt(i)) { //check 문자가 소문자일 때
        		check-=32;
        		if(check==s.charAt(i)) { //같은 문자 일 때
        			System.out.println(s.charAt(i));
        			count+=1;
        		}	
        	}
        	
        	check=s.charAt(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String s="pPoooyY";
		System.out.println(solution(s));	
		
	}

}
