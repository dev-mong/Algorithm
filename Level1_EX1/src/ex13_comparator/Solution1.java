package ex13_comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {

	
	   public static String[] solution(String[] strings, int n) {
	        String[] answer = {};
	        
	        Arrays.sort(strings, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					
					int diff = o1.charAt(n) - o2.charAt(n);
					
					return diff !=0 ? diff : o1.compareTo(o2)  ;
				}
	        });
	        
	        answer=strings.clone();
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		solution(strings, n);
		
		
		
	}

}
