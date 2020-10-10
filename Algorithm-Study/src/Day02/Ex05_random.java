package Day02;

import java.util.Random;

//2장 예제 1
// 키와 사람 수에 대한 난수를 생성하여 값을 구하기 

public class Ex05_random {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println("키의 최대값을 구합니다.");
		int num = ran.nextInt(100)+1; //1~100 난수 발생
		System.out.println("사람 수 :"+num);
		
		int[] height = new int[num]; // 키 배열 생성
		
		System.out.println("키 값은 아래와 같습니다.");
		
		for(int i=0;i<num;i++) {
			height [i] = 100 + ran.nextInt(90); //0~90 까지의 난수를 생성 + 100 = 키 
			System.out.println(i+"번쨰  키 : "+height[i]);
		}
		
		System.out.println("최대값은 "+maxOf(height)+" 입니다.");
		
	}

	static int maxOf(int[] height) {
		
		int max = height[0];
		
		for(int i=0;i<height.length;i++) {
			if(height[i]>max) {
				max = height[i];
			}
		}
			
		return max;
	}
}
