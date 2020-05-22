package ex3_evenOrodd;

public class Solution1 {

   public static String solution(int num) {
        String answer = "";
        
        if(num%2==0) {
        	answer+="Even";
        }else if(num%2!=0) {
        	answer+="Odd";
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int a=3;
		int b=4;
		
		String answer =solution(a);
		System.out.println(answer);
	}

}
