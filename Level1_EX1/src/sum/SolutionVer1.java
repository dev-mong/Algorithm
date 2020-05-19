package sum;

public class SolutionVer1 {

	//두 정수 a,b 사이에 속한 모든 정수의 합 
	public static long solution(int a,int b) {
		long answer=0;
		
		
		while(true) {
			answer+=b;
			if(a<=b) {
			return answer;	
			} 
			b++;
		}
		
	}
	
	
	
	public static void main(String[] args) {

		int a=5;
		int b=3;
		
		
		long result = solution(a,b);
		System.out.println(result);
	}

}
