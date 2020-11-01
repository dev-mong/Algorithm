package ex20_descInt;

import java.util.Arrays;
import java.util.Collections;

//정수 내림차순으로 배치


//valueOf() 메소드를 활용해서 String 객체로 변환


public class Solution1 {

	
	public static long solution(long n) {
		long answer = 0;
		
		String snum = String.valueOf(n); //문자열로 변환
		String[] result = snum.split(""); //문자열을 구분해서 배열에 저장 

		
		String str = new String();
		
		// 내림 차순 정렬 
		Arrays.sort(result,Collections.reverseOrder()); 
		
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
			str += result[i];
		}
		
		
		answer = Long.parseLong(str);
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		long n = 118372;
		solution(n);
	}

}
