package ex4_word;

public class Solution2 {
	
	  public static String solution(String s) {
	        String answer = "";
			String[] arr=s.split(" ");
			char c= ' ';
			
			for(int i=0;i<arr.length;i++) {
				
				for(int j=0;j<arr[i].length();j++) {
					
					if(j%2==0) {
						c=arr[i].charAt(j);
						c=(char)(c-32);		
					}else {
						c=arr[i].charAt(j);
					}
					answer+=c;
				}
				answer+=" ";
			}
	        return answer;
	    }

	public static void main(String[] args) {
		
		String s="try hello world";
		s=solution(s);
		System.out.println(s);
				
	}
}
