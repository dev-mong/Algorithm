package ex11_string4;

public class Solution1 {

	static boolean solution(String s) {
        boolean answer = true;
       
        
        int pcount=0;
        int ycount=0;
       
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='P' || s.charAt(i)=='p') {
        		pcount++;
        	}
        	else if(s.charAt(i)=='Y' || s.charAt(i)=='y') {
        		ycount++;
        	}
        }
        
        if(pcount!=ycount) {
        	answer=false;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String s="pPoooyY";
		System.out.println(solution(s));	
		
	}

}
