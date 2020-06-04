package ex6_phoneNumber;

public class Solution1 {

	 public static String solution(String phone_number) {
	        String answer = "";
	 
	    	for(int i=0;i<phone_number.length()-4;i++) {
	    		
	    		answer+="*";
	    
	    	}
	    	
	    	answer+=phone_number.substring(phone_number.length()-4,phone_number.length());
	    	
	        return answer;
	 }
	
	public static void main(String[] args) {
		
		String phone_number="01033334444";

		
		phone_number=solution(phone_number);
		
		
		System.out.println(phone_number);
		
	}

}
