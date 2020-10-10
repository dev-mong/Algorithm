package Day02;

import java.util.Scanner;

//예제 16,17
//n단의 * 피라미드 출력 
//n단의 숫자 피라미드 출력

public class Ex4_pira {

	public static void main(String[] args) {
		
		
		
		System.out.println("단수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("-- * 피라미드 출력  --\n");
		spira(num);
		
		System.out.println("-- 숫자 피라미드 출력  --\n");
		npira(num);
	}

	// * 피라미드 출력 메소드
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) { //칸 띄어쓰기
				System.out.print(" ");
			}
			int cal = (i - 1) * 2 + 1;
			for (int j = 0; j < cal; j++) { //별 출력
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//숫자 피라미드 출력 메소드
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) { //칸 띄어쓰기
				System.out.print(" ");
			}
			int cal = (i - 1) * 2 + 1;
			int num = i%10;
			for (int j = 0; j < cal; j++) { //별 출력
				
				System.out.print(num);
			}
			System.out.println();
		}
	}

}
