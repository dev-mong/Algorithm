package ex11_string4;

public class Solution1 {

	static boolean solution(String s) {
        boolean answer = true;
        char check=s.charAt(0);
        int count=0;
       
        
        for(int i=1;i<s.length();i++) {
        	if(check>s.charAt(i)) { //check 문자가 소문자일 때
        		check-=32;
        		if(check==s.charAt(i)) { //같은 문자 일 때
        			System.out.println(s.charAt(i));
        		}count++;
        	}else if(check<s.charAt(i)) {//check 문자가 대문자일 때
        		System.out.println(check);
        		check+=32;
        		if(check==s.charAt(i)) { //같은 문자 일 때
        			System.out.println(s.charAt(i));
        		}count++;
        	}else {
        		count++;
        	}
        	check=s.charAt(i);
        }
       
        if(count%2!=0 || count==0) {
        	answer=false;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String s="pPoooyY";
		System.out.println(solution(s));	
		
	}

}
