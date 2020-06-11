package ex9_string3;

public class Solution1 {

   public static String solution(String s) {
        String answer = "";
        int index=s.length()/2;
        int num=s.length()%2;
        
        if(num != 0) { //홀수
        	answer+=s.charAt(index);
        }else if(num==0) {//짝수
        	answer+=s.charAt(index-1);
        	answer+=s.charAt(index);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		String s="qwer";
		
		System.out.println(solution(s));
	}

}
