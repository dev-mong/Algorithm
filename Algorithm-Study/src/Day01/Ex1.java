package Day01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		System.out.println("���ڸ� �Է��ϼ���.");
		int b = sc.nextInt();
		System.out.println("���ڸ� �Է��ϼ���.");
		int c = sc.nextInt();
		System.out.println("���ڸ� �Է��ϼ���.");
		int d = sc.nextInt();
		
		int max = max4(a,b,c,d);
		
		System.out.println("�ִ밪 " +max);
	}
	
//	static int max4(int a,int b, int c, int d) {
//		int max = a;
//		
//		if(max < b) {
//			max = b; 
//		} 
//		if(max < c) {
//			max = c;
//		}
//		if(max < d) {
//			max = d;
//		}
//		return max;
//	}
	
	static int max4(int a, int b, int c, int d) {
		int[] arr= {a,b,c,d};
		
		int max = 0;
		
		Arrays.sort(arr);
		
		
		return max;
		
		
	}
	
	
}
