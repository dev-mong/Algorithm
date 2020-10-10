package Day02;

import java.util.ArrayList;
import java.util.Scanner;

//예제 6
//2진수

public class Ex07_conv {

	public static void main(String[] args) {
		
		
		System.out.println("10진수를 기수 변환합니다.");
		System.out.println("변환하는 정수 :");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("어떤 진수로 변환 할 까요 ?");
		int r = sc.nextInt();
		
		cardConv(x, r);
	}

	static int cardConv(int x, int r) {
		

		ArrayList<Integer> list = new ArrayList<>();
		
		while(x > 0) {
			
			System.out.println(x);
			int rest = x % r;
			x = x/r;
			list.add(rest); // 나머지 저장
			System.out.println("나머지"+rest);
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		
		return 0;
		
		
	}
	
}
